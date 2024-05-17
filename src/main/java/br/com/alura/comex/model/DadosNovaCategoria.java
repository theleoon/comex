package br.com.alura.comex.model;

import org.hibernate.validator.constraints.Length;

public record DadosNovaCategoria(@Length(min = 5) String nome) {
    public Categoria toEntity() {
        return new Categoria(nome);
    }
}
