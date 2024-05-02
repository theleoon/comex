package br.com.alura.comex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriaController {

    @PatchMapping("/api/categoria/{id}/desativa")
    public void desativa(@PathVariable("id") Long categoriaId){

        // service de categoria, desativa a categoria.

        System.out.println(categoriaId);
    }

    @PatchMapping("/api/categoria/{id}/ativa")
    public void ativa(@PathVariable("id") Long categoriaId){

        // service de categoria, ativa a categoria.

        System.out.println(categoriaId);
    }

}
