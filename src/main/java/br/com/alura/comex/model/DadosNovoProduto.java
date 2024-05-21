package br.com.alura.comex.model;

import br.com.alura.comex.service.CategoriaService;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

import java.math.BigDecimal;
import java.util.Optional;

public record DadosNovoProduto(@NotNull @Length(min = 2) String nome,
                               String descricao,
                               @NotNull @Positive BigDecimal preco,
                               @NotNull Integer quantidadeEmEstoque,
                               @NotNull Long categoriaId) {

    public Produto toEntity(CategoriaService categoriaService) throws IllegalArgumentException {

        Optional<Categoria> categoria = categoriaService.buscaPorId(this.categoriaId);
        if (categoria.isEmpty())
            throw new IllegalArgumentException("Impossível carregar categoria, id: "+ categoriaId);

        return new Produto(this.nome,
                this.descricao,
                this.preco,
                this.quantidadeEmEstoque,
                categoria.get());
    }

}
