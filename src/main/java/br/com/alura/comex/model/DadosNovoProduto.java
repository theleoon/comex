package br.com.alura.comex.model;

import br.com.alura.comex.service.CategoriaService;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.util.Optional;

public record DadosNovoProduto(@NotNull @Length(min = 2) String nome,
                               String descricao,
                               @NotNull @Positive BigDecimal preco,
                               @NotNull Integer quantidadeEmEstoque,
                               @NotNull Long categoriaId) {
    public Produto toEntity(CategoriaService categoriaService) throws IllegalArgumentException {
        Optional<Categoria> optionalCategoria = categoriaService.buscaPorId(this.categoriaId);

        if (optionalCategoria.isEmpty())
            throw new IllegalArgumentException("O ID informado da categoria não existe, id: " + this.categoriaId);

        return new Produto(this.nome, this.descricao, this.preco, this.quantidadeEmEstoque, optionalCategoria.get());
    }
}
