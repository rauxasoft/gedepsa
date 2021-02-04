package com.sinensia.productosboot.backend.integration.model.dtos;

public class Producto3DTO {

	private String product;
	private double price;
	private double retailPrice;
	private String descatalogado;
	
	public Producto3DTO() {
		
	}
	
	public Producto3DTO(String product, double price, double retailPrice, boolean descatalogado) {
		this.descatalogado = descatalogado ? "*" : null;
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
	
	public String getDescatalogado() {
		return descatalogado;
	}

	public void setDescatalogado(String descatalogado) {
		this.descatalogado = descatalogado;
	}

	@Override
	public String toString() {
		return "Producto3DTO [product=" + product + ", price=" + price + ", retailPrice=" + retailPrice
				+ ", descatalogado=" + descatalogado + "]";
	}

}
