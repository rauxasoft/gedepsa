package com.sinensia.productosboot.backend.integration.model.dtos;

public class Producto2DTO {

	private String product;
	private double price;
	private double retailPrice;
	
	public Producto2DTO() {
		
	}

	public Producto2DTO(String product, double price, double retailPrice) {
		this.product = product;
		this.price = price;
		this.retailPrice = retailPrice;
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

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	@Override
	public String toString() {
		return "Producto2DTO [product=" + product + ", price=" + price + ", retailPrice=" + retailPrice + "]";
	}

}
