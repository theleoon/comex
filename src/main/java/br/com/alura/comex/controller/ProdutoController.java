package br.com.alura.comex.controller;

import br.com.alura.comex.model.DadosNovoProduto;
import br.com.alura.comex.model.DadosProduto;
import br.com.alura.comex.model.Produto;
import br.com.alura.comex.service.CategoriaService;
import br.com.alura.comex.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProdutoController {

    @Autowired
    private CategoriaService categoriaService;
    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity cadastra(@RequestBody @Valid DadosNovoProduto form,
                                    BindingResult result){

        if (result.hasFieldErrors()) return ResponseEntity.badRequest().build();

        try {
            Produto novoProduto = form.toEntity(categoriaService);
            produtoService.cadastra(novoProduto);
            return ResponseEntity.ok().body(DadosProduto.build(novoProduto));
        } catch (IllegalArgumentException ex) {
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }

    @GetMapping
    public ResponseEntity<List<DadosProduto>> lista(){
        List<DadosProduto> dadosProdutoList = new ArrayList<>();
        produtoService.listaTodos().forEach(produto -> {
            dadosProdutoList.add(DadosProduto.build(produto));
        });
        return ResponseEntity.ok().body(dadosProdutoList);
    }

}
