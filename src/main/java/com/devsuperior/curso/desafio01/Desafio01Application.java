package com.devsuperior.curso.desafio01;

import com.devsuperior.curso.desafio01.entities.Order;
import com.devsuperior.curso.desafio01.services.OrderService;
import com.devsuperior.curso.desafio01.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio01Application implements CommandLineRunner {

	@Autowired
	private OrderService service;

	public static void main(String[] args) {
		SpringApplication.run(Desafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order1 = new Order(1034, 150.0, 20.0);
		System.out.println("Pedido código: " + order1.getCode());
		System.out.println("Valor total: " + service.total(order1));
		System.out.println();

		Order order2 = new Order(2282, 800.0, 10.0);
		System.out.println("Pedido código: " + order2.getCode());
		System.out.println("Valor total: " + service.total(order2));
		System.out.println();

		Order order3 = new Order(1309, 95.9, 0.0);
		System.out.println("Pedido código: " + order3.getCode());
		System.out.println("Valor total: " + service.total(order3));
	}
}
