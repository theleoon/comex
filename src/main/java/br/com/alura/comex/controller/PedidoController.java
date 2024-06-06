package br.com.alura.comex.controller;

import br.com.alura.comex.model.*;
import br.com.alura.comex.repository.PedidoRepository;
import br.com.alura.comex.service.ClienteService;
import br.com.alura.comex.service.PedidoService;
import br.com.alura.comex.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;
    @Autowired
    private ClienteService clienteService;
    @Autowired
    private ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Object> cadastra(@RequestBody @Valid DadosNovoPedido form){

        Optional<Cliente> optionalCliente = clienteService.buscaClientePorId(form.clienteId());
        if (optionalCliente.isEmpty()) return ResponseEntity.badRequest().body("Cliente não encontrado!");

        List<ItemDePedido> itens = pedidoService.buildItens(form);
        if (itens == null && itens.isEmpty()) return ResponseEntity.badRequest().body("Há produtos inválidos no pedido!");

        Pedido novoPedido = new Pedido(LocalDate.now(), optionalCliente.get(), itens);
        pedidoService.cadastra(novoPedido);

        return ResponseEntity.ok().build();
    }



}
