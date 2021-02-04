package com.sinensia.productosboot.backend.business.model;

import java.util.Date;

public class Envio {

	private int codigo;  // autogenerada
	private Almacen almacen;
	private Date fechaRecogida;
	private Date fechaEntrega;
	private Direccion direccion;
	private String observaciones;
	private Long numeroTracking; // Long debe permitir la existencia de nulos.
	
	public Envio() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	public Date getFechaRecogida() {
		return fechaRecogida;
	}

	public void setFechaRecogida(Date fechaRecogida) {
		this.fechaRecogida = fechaRecogida;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Long getNumeroTracking() {
		return numeroTracking;
	}

	public void setNumeroTracking(Long numeroTracking) {
		this.numeroTracking = numeroTracking;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigo;
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
		Envio other = (Envio) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Envio [codigo=" + codigo + ", almacen=" + almacen + ", fechaRecogida=" + fechaRecogida
				+ ", fechaEntrega=" + fechaEntrega + ", direccion=" + direccion + ", observaciones=" + observaciones
				+ ", numeroTracking=" + numeroTracking + "]";
	}
	
}
