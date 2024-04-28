package br.com.alura.comex;

import br.com.alura.comex.model.Categoria;
import br.com.alura.comex.model.Produto;

import java.math.BigDecimal;

public class TesteProduto {

    public static void main(String[] args) {

        System.out.println("Teste de produto");

        Produto celular =
                new Produto("Samsung S21",
                        "Android",
                        new BigDecimal("4800.0"),
                        10,
                        new Categoria("Celular"));

        Produto celular2 =
                new Produto("Samsung S22",
                        "Android",
                        new BigDecimal("2500.0"),
                        10,
                        new Categoria("Celular"));

        System.out.println("Produto 1:" +celular );
        System.out.println("Produto 2:" +celular2 );

        if (celular.equals(celular2)){
            System.out.println("São iguais!");
        } else System.out.println("Não são iguais!");

    }
}
