package br.com.alura.comex.service;

import br.com.alura.comex.model.Produto;
import br.com.alura.comex.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;
    public void cadastra(Produto novoProduto) {
        if (novoProduto == null) return;

        produtoRepository.save(novoProduto);
    }

    public List<Produto> listaTodos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscaPorId(Long id) {
        return produtoRepository.findById(id);
    }
}
