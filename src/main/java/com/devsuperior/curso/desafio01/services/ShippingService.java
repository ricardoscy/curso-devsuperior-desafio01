package com.devsuperior.curso.desafio01.services;

import com.devsuperior.curso.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double valor = order.getBasic();

        if (valor < 100.0) {
            valor += 20.0;
        } else if (valor >= 100 && valor < 200) {
            valor += 12.0;
        }

        return valor;
    }


}
