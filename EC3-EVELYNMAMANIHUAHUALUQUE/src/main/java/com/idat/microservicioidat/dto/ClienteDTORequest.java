package com.idat.microservicioidat.dto;

public class ClienteDTORequest {

	private Integer id;
	private String nombreCliente;
	private Integer celularCliente;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public Integer getCelularCliente() {
		return celularCliente;
	}
	public void setCelularCliente(Integer celularCliente) {
		this.celularCliente = celularCliente;
	}
}
