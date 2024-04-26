package br.com.alura.comex;

import br.com.alura.comex.model.Cliente;
import br.com.alura.comex.model.Pedido;

import java.math.BigDecimal;

public class TestaPedido {

    public static void main(String[] args) {

        Cliente alura = new Cliente("Karina", "999999999", "alura@alura.com");
        Pedido novoPedido = new Pedido(alura, new BigDecimal("1250.00"), 10);

        System.out.println(novoPedido);
        BigDecimal totalDoPedido = novoPedido.getValorTotal();
        System.out.println("Total do pedido: " + totalDoPedido);
    }
}
