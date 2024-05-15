package br.com.alura.comex.util;

import jakarta.persistence.*;

public class JPAUtil {

    public EntityManager getEntityManager(){
        return Persistence.createEntityManagerFactory("mysql").createEntityManager();
    }

}
