package br.com.alura.comex.service;

import br.com.alura.comex.model.Cliente;
import br.com.alura.comex.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
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

    public Optional<Cliente> buscaClientePorId(Long id) {
        return repository.findById(id);
    }
}
