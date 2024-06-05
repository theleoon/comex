package br.com.alura.comex.model;

import org.springframework.data.domain.Pageable;

import java.util.List;

public record DadosProdutoPaginado(List<DadosProduto> produtos, Pageable page){

}
