package com.delivery_api.Projeto.Delivery.API.service;


import com.delivery_api.Projeto.Delivery.API.dto.request.ProdutoRequestDTO;
import com.delivery_api.Projeto.Delivery.API.dto.response.ProdutoResponseDTO;

import java.math.BigDecimal;
import java.util.List;


public interface ProdutoService {

    //Cadastrar novo produto
    ProdutoResponseDTO cadastrar(ProdutoRequestDTO dto);

    //Listar todos os produtos

    //Buscar produto por ID
    ProdutoResponseDTO buscarPorId(Long id);

    //Atualizar produto
    ProdutoResponseDTO atualizar(Long id, ProdutoRequestDTO dto);

    //Desativar produto
    ProdutoResponseDTO ativarDesativarProduto(Long id);

    //Bucar por nome
    ProdutoResponseDTO buscarPorNome(String nome);

    //Buscar produtos por restaurante
    List<ProdutoResponseDTO>  buscarPorRestaurante(Long restauranteId);

    //Todos produtos disponíveis
    List<ProdutoResponseDTO> buscarTodosProdutos();

    //Produtos por categoria
    List<ProdutoResponseDTO> buscarPorCategoria(String categoria);

    //Produtos por faixa de preço (menor ou igual)
    List<ProdutoResponseDTO> buscarPorPreco(BigDecimal precoMinimo, BigDecimal precoMaximo);
    List<ProdutoResponseDTO> buscarPorPrecoMenorOuIgual(BigDecimal valor);

}
