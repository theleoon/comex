package br.com.alura.comex.controller;

import br.com.alura.comex.dao.CategoriaDao;
import br.com.alura.comex.model.Categoria;
import br.com.alura.comex.service.CategoriaService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class CategoriaController {

    @PostMapping("/categoria")
    public void cadastra(String nomeDaCategoria){
        Categoria novaCategoria = new Categoria(nomeDaCategoria);
        CategoriaService service = new CategoriaService();
        service.cadastra(novaCategoria);
    }

    @GetMapping("/categoria")
    public Categoria getCategoriaPorNome(String nome){
        String nomeDaCategoria = nome;
        CategoriaDao dao = new CategoriaDao();
        Categoria categoria = dao.buscarPorNome(nomeDaCategoria);

        return null;
    }

}
