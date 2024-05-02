package br.com.alura.comex.testes;

import br.com.alura.comex.model.Categoria;
import br.com.alura.comex.model.StatusCategoriaEnum;
import br.com.alura.comex.util.JPAUtil;

import javax.persistence.EntityManager;

public class TestaCategoria {

    public static void main(String[] args) {

        EntityManager manager = new JPAUtil().getEntityManager();
        Categoria novaCategoria = new Categoria("Celular");

        manager.getTransaction().begin();
        manager.persist(novaCategoria);
        manager.getTransaction().commit();
    }
}
