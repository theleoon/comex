package br.com.alura.comex;

import br.com.alura.comex.model.Cliente;
import br.com.alura.comex.model.Pedido;

import java.math.BigDecimal;

public class TestaPedido {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Alura", "99999999", "alura@alura.com");
        Pedido novoPedido = new Pedido(cliente, new BigDecimal("1499.90"), 5);

        Long numeroLong = 13300L;
        BigDecimal numeroBig = new BigDecimal("159.90");

        System.out.println(numeroLong);
        System.out.println(numeroBig);

        BigDecimal totalDoPedido = novoPedido.getValorTotal();

//        System.out.println(totalDoPedido);

        String sql = "SELECT * from CLIENTE;";

    }
}
