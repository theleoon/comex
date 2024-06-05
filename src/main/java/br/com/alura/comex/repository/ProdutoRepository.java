package br.com.alura.comex.repository;

import br.com.alura.comex.model.Produto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Sort;

import java.util.List;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
    Produto findByNome(String nome);

    Produto findByNomeAndDescricao(String nome, String descricao);

    List<Produto> findAll(Sort sort);
    Page<Produto> findAll(Pageable page);

//    @Query(" " +
//            "SELECT p FROM Produto p " +
//            "WHERE p.nome = :nome and p.categoria.nome = :categoria" +
//            "ORDER BY p.nome ASC" +
//            " ")
//    Produto findByNomeAndCategoriaOrderByNomeAsc(String nome, String categoria);
}
