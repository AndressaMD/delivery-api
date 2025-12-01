package com.delivery_api.Projeto.Delivery.API.service;

import com.delivery_api.Projeto.Delivery.API.dto.request.ClienteRequestDTO;
import com.delivery_api.Projeto.Delivery.API.dto.response.ClienteResponseDTO;

import java.util.List;

public interface ClienteService {

   //Cadastrar novo cliente
   ClienteResponseDTO cadastrar(ClienteRequestDTO dto);

   //Buscar cliente por ID
   ClienteResponseDTO buscarPorId(Long id);

   //Buscar por email
   ClienteResponseDTO buscarPorEmail(String email);

   //Atualizar dados do cliente
   ClienteResponseDTO atualizar(Long id, ClienteRequestDTO dto);

   //Ativar ou desativar
   ClienteResponseDTO ativarDesativar(Long id);

   //Listar todos os clientes ativos
   List<ClienteResponseDTO> listarAtivos();

   //Buscar clientes por nome
   List<ClienteResponseDTO> buscarPorNome(String nome);

}

