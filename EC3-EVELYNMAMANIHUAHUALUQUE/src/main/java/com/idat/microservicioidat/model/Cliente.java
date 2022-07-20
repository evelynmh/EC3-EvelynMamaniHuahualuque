package com.idat.microservicioidat.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Table(name = "Cliente")
@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;
	private String nombre;
	private Integer celular;
	
	@OneToOne(mappedBy = "cliente")
	private UsuarioCliente usuario;
	
	
	@ManyToMany
	@JoinTable(name="cliente_hospital", joinColumns = 
			@JoinColumn(name="id_cliente", nullable = false, unique = true, 
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_cliente) references Cliente(id_cliente")
			),
			inverseJoinColumns = @JoinColumn(name="id_hospital", nullable = false, unique = true, 
			foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(id_hospital) references cliente(id_hospital")
			)	
	)
	private List<Hospital> hospital = new ArrayList<>();
	
	
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getCelular() {
		return celular;
	}
	public void setCelular(Integer celular) {
		this.celular = celular;
	}
	public UsuarioCliente getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioCliente usuario) {
		this.usuario = usuario;
	}
	public List<Hospital> getHospital() {
		return hospital;
	}
	public void setHospital(List<Hospital> hospital) {
		this.hospital = hospital;
	}
	
	
}
