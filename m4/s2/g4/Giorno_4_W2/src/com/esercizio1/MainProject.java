package com.esercizio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainProject {
	
	private static Logger log = LoggerFactory.getLogger(MainProject.class);
	
	static List<Product> listaProduct = new ArrayList<Product>();
	static List<Order> listaOrder = new ArrayList<Order>();
	
	public static void main(String[] args) {
	
		Product p1 = new Product(1l, "Il Signore degli Anelli", "Books", 25.6);
		Product p2 = new Product(2l, "Ciuccio", "Baby", 5.0);
		Product p3 = new Product(3l, "T-shirt", "Boys", 12.0);
		
		listaProduct.add(p1);
		listaProduct.add(p2);
		listaProduct.add(p3);
		
		Customer c1 = new Customer(1l, "Mario Rossi", 1);
		Customer c2 = new Customer(2l, "Giuseppe Verdi", 2);
		
		Order o1 = new Order(1l, "Evaso", LocalDate.of(2021, 1, 25), LocalDate.of(2021, 01, 30), Arrays.asList(p1, p3), c1);
		Order o2 = new Order(2l, "Consegnato", LocalDate.of(2021, 2, 5), LocalDate.of(2021, 02, 06), Arrays.asList(p1, p2, p3), c2);
		Order o3 = new Order(3l, "Spedito", LocalDate.of(2021, 5, 9), LocalDate.of(2021, 05, 12), Arrays.asList(p2, p3), c1);
		Order o4 = new Order(4l, "Consegnato", LocalDate.of(2021, 6, 15), LocalDate.of(2021, 06, 20), Arrays.asList(p1, p2), c2);
		
		listaOrder.add(o1);
		listaOrder.add(o2);
		listaOrder.add(o3);
		listaOrder.add(o4);
		
	}
	
	
	//ESERCIZIO 1
	public static List<Product> esercizio1(List<Product> allProducts) {
		return allProducts
					.stream()
					.filter(p -> p.getCategory().equalsIgnoreCase("Books"))
					.filter(p -> p.getPrice() > 20)
					.collect(Collectors.toList());
	}
	
	
	//ESERCIZIO 2
	public static List<Order> esercizio2(List<Order> allOrders) {
		return allOrders
			.stream()
			.filter(o -> 
				o.getProducts()
					.stream()
					.anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby"))
			).collect(Collectors.toList());
	}
	
	
	//ESERCIZIO 3
	public static List<Product> esercizio3(List<Product> allProducts) {
		return allProducts
					.stream()
					.filter(p -> p.getCategory().equalsIgnoreCase("Boys"))
					.map(p -> {
						p.setPrice(p.getPrice() * 0.9);
						return p;
					})
					.collect(Collectors.toList());
	}
	
	
	//ESERCIZIO 4
	public static List<Product> esercizio4(List<Order> allOrders) {
		return allOrders
					.stream()
					.filter(o -> o.getCustomer().getTier() == 2)
					.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 2, 1)) >= 0)
					.filter(o -> o.getOrderDate().compareTo(LocalDate.of(2021, 4, 1)) <= 0)
					.flatMap(o -> o.getProducts().stream())
					.distinct()
					.collect(Collectors.toList());
	}

}
