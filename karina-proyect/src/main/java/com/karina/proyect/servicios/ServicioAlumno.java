 package com.karina.proyect.servicios;



import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.karina.proyect.model.Alumno;

@Service
public class ServicioAlumno {
	@Autowired 
	private RepoAlumno repoAlumno;
	private String Mensaje;
	
	public String getMensaje() {
		return Mensaje;
	}
	
	public void setMensaje(String mensaje){
		Mensaje = mensaje;
	}
	
	public boolean validar(String id, String clave, HttpSession sesion)
	{
		Alumno usr= repoAlumno.validar(id, clave);
		if(usr !=null)
		{
			sesion.setAttribute("id", usr.getId());
			Mensaje = usr.getNombre()+ " - " + usr.getId();
			return true;
		}
		Mensaje= "Datos de acceso incorrectos";
		return false;
	}
	
	
	
	public boolean agregar(Alumno alumno, HttpSession sesion) {
		try {
			sesion.setAttribute("id", alumno.getId());
			repoAlumno.save(alumno);
			this.Mensaje = "Datos del alumno almacenados exitosamente.";
			return true;
		} catch (Exception e) {
			this.Mensaje = "Error al ingresar los datos." + e.getMessage() + e.getStackTrace();
			return false;
		}
	}	
}
