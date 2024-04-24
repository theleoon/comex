package br.com.alura.comex.dao;

import br.com.alura.comex.Cliente;
import br.com.alura.comex.util.JPAUtil;

import javax.persistence.EntityManager;

public class ClienteDao {
    public void salvar(Cliente karina) {

        EntityManager manager = new JPAUtil().getEntityManager();

        manager.getTransaction().begin();
        manager.persist(karina);
        manager.getTransaction().commit();

    }
}
