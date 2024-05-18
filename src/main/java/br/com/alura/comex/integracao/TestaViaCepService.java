package br.com.alura.comex.integracao;

public class TestaViaCepService {

    public static void main(String[] args) {

        String cep = "09070100";

        ViaCepService viaCepService = new ViaCepService();
        ViaCepResponse resposta = viaCepService.getEndereco(cep);

        System.out.println(resposta);
    }

}
