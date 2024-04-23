package br.com.alura.comex.integracao;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ViaCepService {
    public ViaCepResponse buscaPorCep(String cep) {

        URI endereco =  URI.create("https://viacep.com.br/ws/" + cep + "/json/");

        HttpRequest requisicao = HttpRequest
                                    .newBuilder()
                                    .uri(endereco)
                                    .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newBuilder()
                    .build()
                    .send(requisicao, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), ViaCepResponse.class);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
}
