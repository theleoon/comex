package br.com.alura.comex.repository;

import br.com.alura.comex.model.Categoria;
import br.com.alura.comex.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    Categoria findByNome(String nomeDaCategoria);
    List<Categoria> findByStatus(boolean status);
    List<Categoria> findByNomeAndStatus(String nome, boolean status);
    @Query("select * from produto as prd where prd.categoria.nome = :nome")
    List<Produto> buscaProdutosPorCategoria(String nome);


}
