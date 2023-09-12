package com.redis.bookingsystem.dtos;

import com.redis.bookingsystem.models.Order;
import lombok.Data;

@Data
public class OrderMapper {

    public static OrderDTO convertToOrderDTO(Order order){
        if (order == null){
            return null;
        }
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setId(order.getId());
        orderDTO.setUser(order.getUser());
        orderDTO.setReservations(order.getReservation());

        return orderDTO;
    }

    public static Order convertToOrder(OrderDTO orderDTO){
        if (orderDTO == null){
            return null;
        }

        Order order = new Order();
        order.setId(orderDTO.getId());
        order.setUser(orderDTO.getUser());
        order.setReservation(orderDTO.getReservations());

        return order;
    }
}
