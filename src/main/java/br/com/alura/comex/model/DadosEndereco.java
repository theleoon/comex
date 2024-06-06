package br.com.alura.comex.model;

public record DadosEndereco(String rua, Integer numero, String bairro, String cidade, String estado) {
    public static DadosEndereco build(Endereco endereco) {
        return new DadosEndereco(endereco.getRua(),
                endereco.getNumero(),
                endereco.getBairro(),
                endereco.getCidade(),
                endereco.getEstado());
    }
}
