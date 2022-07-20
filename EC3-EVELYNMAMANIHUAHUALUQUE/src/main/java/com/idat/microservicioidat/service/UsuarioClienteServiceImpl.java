package com.idat.microservicioidat.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.microservicioidat.dto.UsuarioClienteDTORequest;
import com.idat.microservicioidat.dto.UsuarioClienteDTOResponse;
import com.idat.microservicioidat.model.UsuarioCliente;
import com.idat.microservicioidat.repository.UsuarioClienteRepository;

@Service
public class UsuarioClienteServiceImpl implements UsuarioClienteService{

	@Autowired
	private UsuarioClienteRepository repository;
	
	@Override
	public void guardarUsuarioCliente(UsuarioClienteDTORequest usuario) {
		UsuarioCliente u = new UsuarioCliente();
		u.setUsuario(usuario.getUsuarioCliente());
		u.setPassword(usuario.getPasswordUsuario());
		u.setRol(usuario.getRolUsuario());
		repository.save(u);
	}

	@Override
	public void actualizarUsuarioCliente(UsuarioClienteDTORequest usuario) {
		UsuarioCliente u = new UsuarioCliente();
		u.setIdUsuario(usuario.getId());
		u.setUsuario(usuario.getUsuarioCliente());
		u.setPassword(usuario.getPasswordUsuario());
		u.setRol(usuario.getRolUsuario());
		repository.saveAndFlush(u);
	}

	@Override
	public void eliminarUsuarioCliente(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public List<UsuarioClienteDTOResponse> listarUsuarioCliente() {
		List<UsuarioClienteDTOResponse> listar = new ArrayList<>();
		UsuarioClienteDTOResponse dto = null;
		List<UsuarioCliente> u = repository.findAll();
		
		for (UsuarioCliente usuario : u) {
			dto = new UsuarioClienteDTOResponse();
			dto.setUsuarioCliente(usuario.getUsuario());
			dto.setPasswordUsuario(usuario.getRol());
			dto.setRolUsuario(usuario.getRol());
			dto.setId(usuario.getIdUsuario());
			
			listar.add(dto);
		}
		
		return listar;
	}

	@Override
	public UsuarioClienteDTOResponse obtenerUsuarioClienteId(Integer id) {
		UsuarioCliente usuario = repository.findById(id).orElse(null);
		UsuarioClienteDTOResponse dto = new UsuarioClienteDTOResponse();
		
		dto.setUsuarioCliente(usuario.getUsuario());
		dto.setPasswordUsuario(usuario.getRol());
		dto.setRolUsuario(usuario.getRol());
		dto.setId(usuario.getIdUsuario());
		
		return dto;
	}

}
