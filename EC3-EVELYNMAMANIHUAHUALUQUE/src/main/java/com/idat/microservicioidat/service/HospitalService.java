package com.idat.microservicioidat.service;

import java.util.List;

import com.idat.microservicioidat.dto.HospitalDTORequest;
import com.idat.microservicioidat.dto.HospitalDTOResponse;

public interface HospitalService {

	void guardarHospital(HospitalDTORequest hospital);
	void actualizarHospital(HospitalDTORequest hospital);
	void eliminarHospital(Integer id);
	List<HospitalDTOResponse> listarHospital();
	HospitalDTOResponse obtenerHospitalId(Integer id);
}
