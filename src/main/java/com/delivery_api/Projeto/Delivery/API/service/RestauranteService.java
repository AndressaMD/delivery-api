package com.delivery_api.Projeto.Delivery.API.service;

import com.delivery_api.Projeto.Delivery.API.dto.request.RestauranteRequestDTO;
import com.delivery_api.Projeto.Delivery.API.dto.response.RestauranteResponseDTO;
import com.delivery_api.Projeto.Delivery.API.projection.RelatorioVendas;

import java.math.BigDecimal;
import java.util.List;

public interface RestauranteService {

    //Cadastrar novo restaurante
    RestauranteResponseDTO cadastrar(RestauranteRequestDTO dto);

    //Buscar por ID
    RestauranteResponseDTO buscarPorId(Long id);

    //Atualizar restaurante
    RestauranteResponseDTO atualizar(Long id, RestauranteRequestDTO dto);

    //Inativar restaurante
    RestauranteResponseDTO ativarDesativarRestaurante(Long id);

    //Buscar por nome
    RestauranteResponseDTO buscarPorNome(String nome);

    // Buscar por categoria
    List<RestauranteResponseDTO> buscarPorCategoria(String categoria);

    //Buscar por preço
    List<RestauranteResponseDTO> buscarPorPreco(BigDecimal precoMinimo, BigDecimal precoMaximo);

    // Listar restaurantes ativos
    List<RestauranteResponseDTO> listarAtivos();

    //Top 5
    List<RestauranteResponseDTO> listarTop5PorNome();

    //Relatorio Vendas por Restaurante
    List<RelatorioVendas> relatorioVendasPorRestaurante();

    //Buscar por taxa
    List<RestauranteResponseDTO> buscarPorTaxaEntrega(BigDecimal taxaEntrega);

    //Inativar restaurante
    RestauranteResponseDTO inativarRestaurante(Long id);
}

