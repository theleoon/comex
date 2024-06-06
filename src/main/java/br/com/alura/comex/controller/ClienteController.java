package br.com.alura.comex.controller;

import br.com.alura.comex.model.Cliente;
import br.com.alura.comex.model.DadosCliente;
import br.com.alura.comex.model.DadosNovoCliente;
import br.com.alura.comex.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ResponseEntity<Object> cadastra(@RequestBody DadosNovoCliente form){

        Cliente novoCliente = form.build();
        clienteService.cadastra(novoCliente);

        return ResponseEntity.ok().body(DadosCliente.build(novoCliente));
    }

}

