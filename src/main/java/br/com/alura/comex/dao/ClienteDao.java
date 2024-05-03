package br.com.alura.comex.dao;

import br.com.alura.comex.util.JPAUtil;
import br.com.alura.comex.model.Cliente;

import javax.persistence.EntityManager;

public class ClienteDao {
    public void cadastra(Cliente novoCliente) {
        EntityManager entityManager = JPAUtil.getEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(novoCliente);
        entityManager.getTransaction().commit();
    }
}
