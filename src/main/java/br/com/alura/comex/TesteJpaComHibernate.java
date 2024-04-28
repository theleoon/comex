package br.com.alura.comex;

import br.com.alura.comex.dao.ClienteDao;
import br.com.alura.comex.model.Cliente;
import br.com.alura.comex.model.Endereco;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class TesteJpaComHibernate {

    public static void main(String[] args) {

        Cliente novoCliente = new Cliente("Alura", "99999999", "alura@alura.com",
                new Endereco("Rua Sem Nome", 10, "Bairro Sem Nome", "São Paulo", "SP"));

        ClienteDao clienteDao = new ClienteDao();
        clienteDao.cadastra(novoCliente);

    }
}
