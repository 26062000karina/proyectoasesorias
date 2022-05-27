package com.karina.proyect.servicios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.karina.proyect.model.Alumno;

public interface AlumnoRepositorio extends JpaRepository<Alumno, String>{
	
}
