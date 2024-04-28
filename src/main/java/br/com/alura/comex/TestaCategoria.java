package br.com.alura.comex;

import br.com.alura.comex.dao.CategoriaDao;
import br.com.alura.comex.model.Categoria;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class TestaCategoria {

    public static void main(String[] args) {

        Categoria novaCategoria = new Categoria("Celulares");
        CategoriaDao categoriaDao = new CategoriaDao();
        categoriaDao.cadastrar(novaCategoria);

        new CategoriaDao().cadastrar(new Categoria("Casa"));

    }
}
