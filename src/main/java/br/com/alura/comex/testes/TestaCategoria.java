package br.com.alura.comex.testes;

import br.com.alura.comex.dao.CategoriaDao;
import br.com.alura.comex.model.Categoria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class TestaCategoria {

    public static void main(String[] args) {

        Categoria novaCategoria = new Categoria("Celulares");
        CategoriaDao categoriaDao = new CategoriaDao();
        categoriaDao.cadastrar(novaCategoria);

        new CategoriaDao().cadastrar(new Categoria("Casa"));

    }
}
