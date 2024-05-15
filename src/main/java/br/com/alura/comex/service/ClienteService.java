package br.com.alura.comex.service;

import br.com.alura.comex.model.Cliente;
import br.com.alura.comex.repository.ClienteRepository;

import java.util.List;

public class ClienteService {

    ClienteRepository repository;
    public void cadastra(Cliente novoCliente) {
        repository.save(novoCliente);
    }

    public void deleta(Cliente novoCliente) {
        repository.delete(novoCliente);
    }
    public List<Cliente> listaTodos() {
        return repository.findAll();
    }
    public List<Cliente> listaTodosPorOrdemAlfabetica() {
        return repository.listaPorOrdemAlfabetica();
    }
    public Cliente buscaClientePorNomeECpf(String nome, String cpf) {
        return repository.findClienteByNomeByCpf(nome, cpf);
    }
}
