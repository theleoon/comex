package br.com.alura.comex.dao;

import br.com.alura.comex.model.Produto;
import br.com.alura.comex.util.JPAUtil;

import javax.persistence.EntityManager;

public class ProdutoDao {
    public void salva(Produto novoProduto) {

        EntityManager manager = new JPAUtil().getEntityManager();

        manager.getTransaction().begin();
        manager.persist(novoProduto);
        manager.getTransaction().commit();

    }
}
