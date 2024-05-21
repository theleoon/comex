package br.com.alura.comex.controller;

import br.com.alura.comex.model.DadosNovoProduto;
import br.com.alura.comex.model.Produto;
import br.com.alura.comex.service.CategoriaService;
import br.com.alura.comex.service.ProdutoService;
import jakarta.validation.Valid;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private CategoriaService categoriaService;
    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Object> cadastro(@RequestBody @Valid DadosNovoProduto form, BindingResult result){

        if (result.hasFieldErrors())
            return ResponseEntity.badRequest().build();

        Produto novoProduto;

        try {
            novoProduto = form.toEntity(categoriaService);
            produtoService.cadastra(novoProduto);
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(ex.getMessage());
        }

        return ResponseEntity.ok().body(novoProduto);
    }
}
