package com.karina.proyect.servicios;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.karina.proyect.model.Alumno;

public interface RepoAlumno extends CrudRepository<Alumno, String>{
	@Query(value= "SELECT * FROM Alumno WHERE id= ?1 AND Contrasena= ?2", nativeQuery= true)
	Alumno validar(String id, String Contrasena);
}
