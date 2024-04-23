package br.com.alura.comex;

import java.math.BigDecimal;

public class TestaPedido {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Alura", "99999999", "alura@alura.com");
        Pedido novoPedido = new Pedido(cliente, new BigDecimal("1499.90"), 5);

        BigDecimal totalDoPedido = novoPedido.getValorTotal();

        System.out.println(totalDoPedido);

    }
}
