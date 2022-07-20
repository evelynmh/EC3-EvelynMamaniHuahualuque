package com.idat.microservicioidat.service;

import java.util.List;

import com.idat.microservicioidat.dto.UsuarioClienteDTORequest;
import com.idat.microservicioidat.dto.UsuarioClienteDTOResponse;

public interface UsuarioClienteService {

	void guardarUsuarioCliente(UsuarioClienteDTORequest usuario);
	void actualizarUsuarioCliente(UsuarioClienteDTORequest usuario);
	void eliminarUsuarioCliente(Integer id);
	List<UsuarioClienteDTOResponse> listarUsuarioCliente();
	UsuarioClienteDTOResponse obtenerUsuarioClienteId(Integer id);
}
