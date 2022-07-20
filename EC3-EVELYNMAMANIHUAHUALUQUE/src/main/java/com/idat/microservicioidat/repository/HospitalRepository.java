package com.idat.microservicioidat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.microservicioidat.model.Hospital;

@Repository
public interface HospitalRepository  extends JpaRepository<Hospital, Integer>{

}
