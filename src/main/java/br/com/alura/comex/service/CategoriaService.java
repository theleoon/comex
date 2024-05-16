package br.com.alura.comex.service;

import br.com.alura.comex.dao.CategoriaDao;
import br.com.alura.comex.model.Categoria;
import br.com.alura.comex.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public void cadastra(Categoria novaCategoria) {
        categoriaRepository.save(novaCategoria);
    }

    public void atualiza(Categoria categoria){
        categoriaRepository.save(categoria);
    }

    public void remove(Categoria categoria){
        categoriaRepository.delete(categoria);
    }

    public Categoria buscaPorNome(String nomeDaCategoria){
        return categoriaRepository.findByNome(nomeDaCategoria);
    }

    public List<Categoria> listaTodasPorStatus(boolean status){
        return categoriaRepository.findByStatus(status);
    }



}
