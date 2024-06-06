package br.com.alura.comex.model;

public record DadosNovoCliente(String nome, String cpf, String email) {
    public Cliente build() {
        return new Cliente(this.nome, this.cpf, this.email);
    }
}
