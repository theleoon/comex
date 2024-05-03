package br.com.alura.comex.dao;

import br.com.alura.comex.util.JPAUtil;
import br.com.alura.comex.model.Categoria;

import javax.persistence.EntityManager;

public class CategoriaDao {
    public void cadastrar(Categoria novaCategoria) {
        EntityManager entityManager = JPAUtil.getEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(novaCategoria);
        entityManager.getTransaction().commit();
    }

    public Categoria buscarPorId(long id) {
        EntityManager entityManager = JPAUtil.getEntityManager();

        Categoria categoriaCarregada = entityManager.find(Categoria.class, id);

        return categoriaCarregada;

    }
}
