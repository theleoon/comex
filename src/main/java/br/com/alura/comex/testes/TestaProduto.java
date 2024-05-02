package br.com.alura.comex.testes;

import br.com.alura.comex.dao.CategoriaDao;
import br.com.alura.comex.dao.ProdutoDao;
import br.com.alura.comex.model.Categoria;
import br.com.alura.comex.model.Produto;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class TestaProduto {

    public static void main(String[] args) {

        CategoriaDao categoriaDao = new CategoriaDao();
        Categoria celulares = categoriaDao.buscaPorId(1L);
        System.out.println("Categoria carregada: " + celulares);

        Produto celular = new Produto();
        celular.setNome("Samsung Galaxy S50");
        celular.setQuantidade(10);
        celular.setDescricao("Celular Android com 512 GB");
        celular.setPrecoUnitario(new BigDecimal("1350.59"));
        celular.setCategoria(celulares);

        Produto celular2 = new Produto();
        celular2.setNome("Samsung Galaxy S60");
        celular2.setQuantidade(5);
        celular2.setDescricao("Celular Android com 512 GB");
        celular2.setPrecoUnitario(new BigDecimal("3500.00"));
        celular2.setCategoria(celulares);

        ProdutoDao produtoDao = new ProdutoDao();
        produtoDao.salva(celular);
        produtoDao.salva(celular2);
    }
}
