package com.karina.proyect.servicios;

import java.util.List;

import com.karina.proyect.model.Asesoria;

public interface AsesoriaServicio  {
	public List<Asesoria> listarTodosLasAsesorias();
	
	public Asesoria guardarAsesoria(Asesoria asesoria);
}
