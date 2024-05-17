package br.com.alura.comex.controller;

import br.com.alura.comex.model.Categoria;
import br.com.alura.comex.model.DadosNovaCategoria;
import br.com.alura.comex.service.CategoriaService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @PostMapping("/api/categoria")
    public ResponseEntity cadastra(@RequestBody @Valid DadosNovaCategoria form,
                                   BindingResult result){
        if (result.hasFieldErrors()) {
           return ResponseEntity.badRequest().build();
        }

        categoriaService.cadastro(form.toEntity());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/api/categoria/{id}")
    public ResponseEntity<Object> buscaPorId(@PathVariable("id") Long categoriaId){

        if (categoriaId == null) {
            return ResponseEntity.badRequest().build();
        }

        Optional<Categoria> categoriaCarregada = categoriaService.buscaPorId(categoriaId);
        if (categoriaCarregada.isPresent())
            return ResponseEntity.ok().body(categoriaCarregada.get());

        return ResponseEntity.notFound().build();
    }



}
