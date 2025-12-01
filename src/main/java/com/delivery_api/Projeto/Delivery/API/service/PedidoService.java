package com.delivery_api.Projeto.Delivery.API.service;


import com.delivery_api.Projeto.Delivery.API.dto.request.ItemPedidoRequestDTO;
import com.delivery_api.Projeto.Delivery.API.dto.request.PedidoRequestDTO;
import com.delivery_api.Projeto.Delivery.API.dto.response.PedidoResponseDTO;
import com.delivery_api.Projeto.Delivery.API.enums.StatusPedido;

import java.math.BigDecimal;
import java.util.List;

    public interface PedidoService {

        //Criar pedido
        PedidoResponseDTO criarPedido(PedidoRequestDTO dto);

        //Buscar por id
        PedidoResponseDTO buscarPorId(Long id);

        //Listar
        List<PedidoResponseDTO> listarPedidosPorCliente(Long clienteId);

        //Atualiza
        PedidoResponseDTO atualizarStatusPedido(Long id, StatusPedido status);

        //Calcular valor
        BigDecimal calcularValorTotalPedido(List<ItemPedidoRequestDTO> itens);

        //Cancelar pedido
        PedidoResponseDTO cancelarPedido(Long id);

    }
}
