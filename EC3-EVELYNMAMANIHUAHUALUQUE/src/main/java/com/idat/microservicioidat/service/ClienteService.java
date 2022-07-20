package com.idat.microservicioidat.service;

import java.util.List;

import com.idat.microservicioidat.dto.ClienteDTORequest;
import com.idat.microservicioidat.dto.ClienteDTOResponse;

public interface ClienteService {

	void guardarCliente(ClienteDTORequest cliente);
	void actualizarCliente(ClienteDTORequest cliente);
	void eliminarCliente(Integer id);
	List<ClienteDTOResponse> listarCliente();
	ClienteDTOResponse obtenerClienteId(Integer id);
}
