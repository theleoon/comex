package br.com.alura.comex.repository;

import br.com.alura.comex.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    Cliente findClienteByNomeByCpf(String nome, String cpf);

}
