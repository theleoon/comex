package br.com.alura.comex.model;

import java.util.List;

public record DadosNovoPedido(Long clienteId,
                              List<DadosNovoPedidoProduto> produtos
                              ) {
}
