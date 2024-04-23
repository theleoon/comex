package br.com.alura.comex.integracao;

public class TestaViaCep {

    public static void main(String[] args) {

        String cep = "09070100";

        ViaCepResponse retorno = new ViaCepService().buscaPorCep(cep);

        System.out.println(retorno);

    }

}
