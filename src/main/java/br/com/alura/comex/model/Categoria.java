package br.com.alura.comex.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_id")
    private Long id;
    @Column(name = "nome", length = 120)
    private String nome;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusCategoriaEnum status = StatusCategoriaEnum.ATIVO;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public Categoria() {
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", status=" + status +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public StatusCategoriaEnum getStatus() {
        return status;
    }

    public void setStatus(StatusCategoriaEnum status) {
        this.status = status;
    }
}
