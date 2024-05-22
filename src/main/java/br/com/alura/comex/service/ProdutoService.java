package br.com.alura.comex.service;

import br.com.alura.comex.model.Produto;
import br.com.alura.comex.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    public void cadastra(Produto novoProduto) {
        if (novoProduto == null) return;
        produtoRepository.save(novoProduto);
    }
    public List<Produto> listaProdutos() {
        return produtoRepository.findAll();
    }
}
