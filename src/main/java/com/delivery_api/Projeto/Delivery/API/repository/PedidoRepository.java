package com.delivery_api.Projeto.Delivery.API.repository;


import com.delivery_api.Projeto.Delivery.API.entity.Pedido;

import com.delivery_api.Projeto.Delivery.API.enums.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    //Buscar pedidos por cliente ID
    List<Pedido> findByClienteIdOrderByDataPedidoDesc(Long clienteId);

    //Pedidos por cliente
    List<Pedido> findByClienteId(Long clienteId);

    //Buscar pedidos por restaurante ID
    List<Pedido> findByRestauranteIdOrderByDataPedidoDesc(Long restaurantId);

    //Pedidos por status
    List<Pedido> findByStatus(StatusPedido status);

    //10 pedidos mais recentes
    List<Pedido> findTop10ByOrderByDataPedidoDesc();

    //Pedidos por período
    List<Pedido> findByDataPedidoBetween(LocalDateTime inicio, LocalDateTime fim);

}
