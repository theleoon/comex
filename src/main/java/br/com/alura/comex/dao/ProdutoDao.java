package br.com.alura.comex.dao;

import br.com.alura.comex.util.JPAUtil;
import br.com.alura.comex.model.Produto;

import javax.persistence.EntityManager;

public class ProdutoDao {
    public void cadastra(Produto celular) {

        EntityManager entityManager = JPAUtil.getEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(celular);
        entityManager.getTransaction().commit();
    }
}
