package com.devsuperior.curso.desafio01.services;

import com.devsuperior.curso.desafio01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order){
        calcularDesconto(order);
        return shippingService.shipment(order);
    }

    private void calcularDesconto(Order order){
        Double valor = order.getBasic();
        valor -= valor * (order.getDiscount()/100);

        order.setBasic(valor);
    }
}
