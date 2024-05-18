package br.com.alura.comex.service;

import br.com.alura.comex.model.Cliente;
import br.com.alura.comex.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteService {

    @Autowired
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

}
