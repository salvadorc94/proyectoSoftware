package com.secg.vet.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema="public", name="medicina")
public class Medicine {

	@Id
	Integer id;
	@Column(name="nombre")
	String nombre;
	@Column(name="dosis")
	String dosis;
	@Column(name="cantidad")
	Integer cantidad;
	@Column(name="descripcion")
	String descripcion;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDosis() {
		return dosis;
	}
	
	public void setDosis(String dosis) {
		this.dosis = dosis;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
