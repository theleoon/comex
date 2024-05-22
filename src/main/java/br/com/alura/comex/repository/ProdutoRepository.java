package br.com.alura.comex.repository;

import br.com.alura.comex.model.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
