package br.com.alura.comex.testes;

import br.com.alura.comex.dao.CategoriaDao;
import br.com.alura.comex.dao.ProdutoDao;
import br.com.alura.comex.model.Categoria;
import br.com.alura.comex.model.Produto;

import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import java.math.BigDecimal;

public class TestaJpaProduto {

    public static void main(String[] args) {

        Categoria categoriaDoBanco = new CategoriaDao().buscarPorId(3L);

        Produto celular = new Produto("Samsung S21",
                                        "Android 512GB",
                                        new BigDecimal("2300.00"),
                                        10, categoriaDoBanco);

        ProdutoDao produtoDao = new ProdutoDao();
        produtoDao.cadastra(celular);



    }
}
