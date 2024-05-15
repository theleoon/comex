package br.com.alura.comex.dao;

import br.com.alura.comex.model.Cliente;
import br.com.alura.comex.util.JPAUtil;

import jakarta.persistence.*;

public class ClienteDao {
    public void salvar(Cliente cliente) {

        EntityManager manager = new JPAUtil().getEntityManager();

        manager.getTransaction().begin();
        manager.persist(cliente);
        manager.getTransaction().commit();

    }
}
