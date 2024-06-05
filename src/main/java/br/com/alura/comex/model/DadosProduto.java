package br.com.alura.comex.model;

import org.springframework.data.domain.Pageable;

import java.math.BigDecimal;

public record DadosProduto(Long id,
                           String nome,
                           String descricao,
                           BigDecimal preco,
                           Integer quantidade,
                           Long categoriaId) {
    public static DadosProduto build(Produto novoProduto) {
        return new DadosProduto(novoProduto.getId(),
                novoProduto.getNome(),
                novoProduto.getDescricao(),
                novoProduto.getPrecoUnitario(),
                novoProduto.getQuantidade(),
                novoProduto.getCategoria().getId());
    }
}
