package com.sinensia.productosboot.backend.integration.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="PRODUCTOS")
public class ProductoPL {
	
	@Id
	private int id;

	private String nombre;
	private double precio;
	
	@Enumerated(EnumType.STRING)
	private FamiliaPL familia;
	
	@Temporal(TemporalType.DATE)
	private Date fechaAlta;
	
	@JsonIgnore
	private boolean descatalogado;
	
	public ProductoPL() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public FamiliaPL getFamilia() {
		return familia;
	}

	public void setFamilia(FamiliaPL familia) {
		this.familia = familia;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public boolean isDescatalogado() {
		return descatalogado;
	}

	public void setDescatalogado(boolean descatalogado) {
		this.descatalogado = descatalogado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProductoPL other = (ProductoPL) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProductoPL [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", familia=" + familia
				+ ", fechaAlta=" + fechaAlta + ", descatalogado=" + descatalogado + "]";
	}
	
}
