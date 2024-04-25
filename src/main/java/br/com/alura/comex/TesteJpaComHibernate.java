package br.com.alura.comex;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class TesteJpaComHibernate {

    public static void main(String[] args) {

        EntityManager entityManager = Persistence
                                        .createEntityManagerFactory("mysql")
                                        .createEntityManager();

        Cliente novoCliente = new Cliente("Alura", "99999999", "alura@alura.com",
                new Endereco("Rua Sem Nome", 10, "Bairro Sem Nome", "São Paulo", "SP"));

        entityManager.getTransaction().begin();
        entityManager.persist(novoCliente);
        entityManager.getTransaction().commit();

    }

}
