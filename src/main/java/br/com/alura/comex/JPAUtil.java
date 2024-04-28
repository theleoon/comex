package br.com.alura.comex;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class JPAUtil {

    public static EntityManager getEntityManager() {
        return Persistence
                .createEntityManagerFactory("mysql")
                .createEntityManager();
    }

}
