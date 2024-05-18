package br.com.alura.comex.controller;


import br.com.alura.comex.model.Categoria;
import br.com.alura.comex.service.CategoriaService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CategoriaController {
    @Autowired
    private CategoriaService service;

    @PostMapping("/api/categoria")
    public ResponseEntity cadastra(String nome){
        if (nome == null) return ResponseEntity.badRequest().body("Necessário o parâmetro 'nome'");

        Categoria novaCategoria = new Categoria(nome);
        service.cadastro(novaCategoria);

        return ResponseEntity.ok().build();
    }

    @GetMapping("/api/categoria/{id}")
    public ResponseEntity<Object> buscaPorId(@PathVariable("id") Long categoriaId){

        Optional<Categoria> categoria = service.buscaPorId(categoriaId);

        if (categoria.isPresent()) return ResponseEntity.ok().body(categoria.get());

        return ResponseEntity.notFound().build();
    }


}
