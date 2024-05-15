package br.com.alura.comex.controller;

import br.com.alura.comex.model.Cliente;
import br.com.alura.comex.service.ClienteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @PostMapping
    public String cadastra(String nome){
        System.out.println("Cadastrando um novo cliente");

        Cliente novoCliente = new Cliente();
        novoCliente.setNome(nome);

        ClienteService clienteService = new ClienteService();
        clienteService.cadastra(novoCliente);

        return nome;
    }

}

