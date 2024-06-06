package br.com.alura.comex.service;

import br.com.alura.comex.model.DadosNovoPedido;
import br.com.alura.comex.model.ItemDePedido;
import br.com.alura.comex.model.Pedido;
import br.com.alura.comex.model.Produto;
import br.com.alura.comex.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;

    @Autowired
    private ProdutoService produtoService;

    public void cadastra(Pedido novoPedido) {
        pedidoRepository.save(novoPedido);
    }

    public List<ItemDePedido> buildItens(DadosNovoPedido form) {
        List<ItemDePedido> itens = new ArrayList<>();
        form.produtos().forEach(produto -> {

            Optional<Produto> optionalProduto = produtoService.buscaPorId(produto.produtoId());

            if (optionalProduto.isPresent() && optionalProduto.get().getQuantidade() > 0) {
                ItemDePedido item = new ItemDePedido(produto.quantidade(), optionalProduto.get());
                itens.add(item);
            }
        });
        return itens;
    }
}
