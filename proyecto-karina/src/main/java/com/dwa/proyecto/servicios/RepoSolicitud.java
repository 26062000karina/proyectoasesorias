package com.dwa.proyecto.servicios;


import org.springframework.data.repository.CrudRepository;

import com.dwa.proyecto.modelo.solicitudAsesorias;

public interface RepoSolicitud extends CrudRepository<solicitudAsesorias, Integer>{
	
}
