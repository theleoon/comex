package br.com.alura.comex.dao;

import br.com.alura.comex.model.Categoria;
import br.com.alura.comex.util.JPAUtil;

import javax.persistence.EntityManager;

public class CategoriaDao {
    public Categoria buscaPorId(Long idDaCategoria) {

        EntityManager manager = new JPAUtil().getEntityManager();
        Categoria categoria = manager.find(Categoria.class, idDaCategoria);

        return categoria;
    }
}
