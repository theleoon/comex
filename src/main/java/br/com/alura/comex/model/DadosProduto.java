package br.com.alura.comex.model;

import java.math.BigDecimal;

public record DadosProduto(Long id,
                           String nome,
                           String descricao,
                           BigDecimal precoUnitario,
                           Integer quantidade,
                           String categoria,
                           BigDecimal valorTotalEmEstoque) {
    public static DadosProduto build(Produto produto) {
        return new DadosProduto(produto.getId(),
                produto.getNome(),
                produto.getDescricao(),
                produto.getPrecoUnitario(),
                produto.getQuantidade(),
                produto.getCategoria().getNome(),
                produto.getPrecoUnitario()
                        .multiply(new BigDecimal(produto.getQuantidade())));
    }
}
