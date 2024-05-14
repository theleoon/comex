package br.com.alura.comex.service;

import br.com.alura.comex.dao.CategoriaDao;
import br.com.alura.comex.model.Categoria;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    public void cadastra(Categoria novaCategoria) {

        CategoriaDao categoriaDao = new CategoriaDao();
        categoriaDao.cadastrar(novaCategoria);

    }
}
