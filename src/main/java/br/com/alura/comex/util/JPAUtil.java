package br.com.alura.comex.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Persistence;

public class JPAUtil {

    public static EntityManager getEntityManager() {
        return Persistence
                .createEntityManagerFactory("mysql")
                .createEntityManager();
    }

}
