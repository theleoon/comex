package br.com.alura.comex;

import java.math.BigDecimal;
import java.util.Objects;

public class Pedido {
    private Long id;
    private Cliente cliente;
    private BigDecimal preco;
    private Integer quantidade;

    public Pedido(Cliente cliente, BigDecimal preco, Integer quantidade) {
        this.cliente = cliente;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return Objects.equals(id, pedido.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorTotal() {
        return this.preco.multiply(new BigDecimal(quantidade));
    }

    public boolean isMaisCaroQue(Pedido outroPedido) {
        return this.getValorTotal().compareTo(outroPedido.getValorTotal()) == 1;
    }

    public boolean isMaisBaratoQue(Pedido outroPedido) {
        return this.getValorTotal().compareTo(outroPedido.getValorTotal()) == -1;
    }
}
