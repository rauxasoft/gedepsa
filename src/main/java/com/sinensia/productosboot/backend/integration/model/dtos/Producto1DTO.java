package com.sinensia.productosboot.backend.integration.model.dtos;

public class Producto1DTO {

	private String product;
	private double price;
	
	public Producto1DTO() {
		
	}
	
	public Producto1DTO(String product, double price) {
		this.product = product;
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Producto1DTO [product=" + product + ", price=" + price + "]";
	}
	
}
