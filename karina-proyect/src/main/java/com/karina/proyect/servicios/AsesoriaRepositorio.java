package com.karina.proyect.servicios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.karina.proyect.model.Asesoria;

@Repository
public interface AsesoriaRepositorio extends JpaRepository<Asesoria, Long>{
	

}

