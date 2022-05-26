package com.karina.proyect.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karina.proyect.model.Asesoria;


@Service
public class AsesoriaServicioImpl implements AsesoriaServicio {

	@Autowired
	private AsesoriaRepositorio repositorio;
	
	@Override
	public List<Asesoria> listarTodosLasAsesorias() {
		
		return repositorio.findAll();
	}

	@Override
	public Asesoria guardarAsesoria(Asesoria asesoria) {
		return repositorio.save(asesoria);
	}	
	
	
}
