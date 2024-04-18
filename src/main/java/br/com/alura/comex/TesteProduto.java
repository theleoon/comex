package br.com.alura.comex;

public class TesteProduto {

    public static void main(String[] args) {

        System.out.println("Teste de produto");

        Produto celular =
                new Produto("Samsung S21",
                        "Android",
                        4800.0,
                        10);

        Produto celular2 =
                new Produto("Samsung S22",
                        2500.0,
                        10);

        System.out.println("Produto 1:" +celular );
        System.out.println("Produto 2:" +celular2 );

        if (celular.equals(celular2)){
            System.out.println("São iguais!");
        } else System.out.println("Não são iguais!");

    }
}
