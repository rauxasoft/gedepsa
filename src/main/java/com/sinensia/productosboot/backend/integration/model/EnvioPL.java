package com.sinensia.productosboot.backend.integration.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="ENVIOS")
public class EnvioPL {

	@Id
	private int codigo;
	
	@ManyToOne
	@JoinColumn(name="CODIGO_ALMACEN")
	private AlmacenPL almacen;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaRecogida;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaEntrega;
	
	private DireccionPL direccion;
	private String observaciones;
	private Long numeroTracking;
	
	public EnvioPL() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public AlmacenPL getAlmacen() {
		return almacen;
	}

	public void setAlmacen(AlmacenPL almacen) {
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

	public DireccionPL getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionPL direccion) {
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
		EnvioPL other = (EnvioPL) obj;
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
