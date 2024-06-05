package br.com.alura.comex.controller;

import br.com.alura.comex.model.DadosNovoPedido;
import br.com.alura.comex.model.Pedido;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pedido")
public class PedidoController {
    @PostMapping
    public ResponseEntity<Object> cadastra(@RequestBody @Valid DadosNovoPedido pedido,
                                           BindingResult result){
        System.out.println(pedido);

//        Pedido novoPedido = new Pedido(????0);
//        pedidoService.cadastra(novoPedido);

        return null;

    }
}
