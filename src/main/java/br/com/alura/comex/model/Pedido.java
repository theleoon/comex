package br.com.alura.comex.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "data", nullable = false)
    private LocalDate data = LocalDate.now();

    @JsonIgnore
    @ManyToOne(optional = false)
    private Cliente cliente;

    @Column(name = "desconto", nullable = false, scale = 2)
    private BigDecimal desconto = BigDecimal.ZERO;

    @Column(name = "total", nullable = false, scale = 2)
    private BigDecimal total = BigDecimal.ZERO;

    @Column(name = "tipo_desconto", nullable = false)
    @Enumerated(EnumType.STRING)
    private TipoDescontoPedido tipoDesconto = TipoDescontoPedido.NENHUM;

    @JsonIgnore
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<ItemDePedido> itemPedidos = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public TipoDescontoPedido getTipoDesconto() {
        return tipoDesconto;
    }

    public void setTipoDesconto(TipoDescontoPedido tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }

    public List<ItemDePedido> getItemPedidos() {
        return itemPedidos;
    }

    public void setItemPedidos(List<ItemDePedido> itemPedidos) {
        this.itemPedidos = itemPedidos;
    }
}
