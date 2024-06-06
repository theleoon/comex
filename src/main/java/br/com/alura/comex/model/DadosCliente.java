package br.com.alura.comex.model;

public record DadosCliente(String nome,
                           String cpf,
                           String email,
                           String profissao,
                           String telefone,
                           DadosEndereco endereco) {
    public static DadosCliente build(Cliente cliente) {
        return new DadosCliente(cliente.getNome(),
                cliente.getCpf(),
                cliente.getEmail(),
                cliente.getProfissao(),
                cliente.getTelefone(),
                DadosEndereco.build(cliente.getEndereco()));
    }
}
