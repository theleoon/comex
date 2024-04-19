package br.com.alura.comex;

public class TestaProduto {

    public static void main(String[] args) {

        Produto celular = new Produto();
        celular.setNome("Samsung Galaxy S50");
        celular.setQuantidade(10);
        celular.setDescricao("Celular Android com 512 GB");
        celular.setPrecoUnitario(1350.59);

        Produto celular2 = new Produto();
        celular2.setNome("Samsung Galaxy S50");
        celular2.setQuantidade(5);
        celular2.setDescricao("Celular Android com 512 GB");
        celular2.setPrecoUnitario(3500);

        System.out.println(celular);
        System.out.println(celular2);

        if (celular.equals(celular2)){
            System.out.println("São iguais!");
        } else {
            System.out.println("Não são!");
        }

        System.out.println(celular.getNome());
    }
}
