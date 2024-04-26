package br.com.alura.comex;

import br.com.alura.comex.dao.ClienteDao;
import br.com.alura.comex.model.Cliente;
import br.com.alura.comex.model.Endereco;

public class TestaCliente {
    public static void main(String[] args) {

        Cliente karina = new Cliente("Karina", "999999999", "alura@alura.com", "TI", "9999999",
                            new Endereco("Rua Sem Nome", 50, "Bairro Sem Nome", "São Paulo", "SP"));

        ClienteDao clienteDao = new ClienteDao();
        clienteDao.salvar(karina);


    }
}
