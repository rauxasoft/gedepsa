package com.sinensia.productosboot.backend.integration.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ALMACENES")
public class AlmacenPL {

	@Id
	private int codigo; // business key
	
	private String telefono;
	private String email;
	private DireccionPL direccion;
	
	public AlmacenPL() {
		
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public DireccionPL getDireccion() {
		return direccion;
	}

	public void setDireccion(DireccionPL direccion) {
		this.direccion = direccion;
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
		AlmacenPL other = (AlmacenPL) obj;
		if (codigo != other.codigo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Almacen [codigo=" + codigo + ", telefono=" + telefono + ", email=" + email + ", direccion=" + direccion
				+ "]";
	}
	
}
