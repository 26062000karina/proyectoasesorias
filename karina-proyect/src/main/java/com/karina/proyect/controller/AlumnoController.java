package com.karina.proyect.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.karina.proyect.model.Alumno;
import com.karina.proyect.servicios.ServicioAlumno;

@Controller
public class AlumnoController {
	
	@Autowired
	private ServicioAlumno servicioAlumno;

	
	@GetMapping(path= {"/alumno/validar", "/"})
	public String validar() {
		return "alumno/validar";
	}
	
	@PostMapping("/alumno/validar")
	public String validar(@RequestParam("id")String id, 
			@RequestParam("Contrasena")String Contrasena, Model model, HttpSession sesion) {
		boolean res = servicioAlumno.validar(id, Contrasena, sesion);
		if(res) {
			return "redirect:/asesorias/listar";
		}
		model.addAttribute("error", servicioAlumno.getMensaje());
		model.addAttribute("id", id);
		model.addAttribute("Contrasena", Contrasena);
		return "/alumno/validar";
	}
	
	@GetMapping("/alumno/agregar")
	public String agregar(Model model){
		model.addAttribute("alumno", new Alumno());
		return "alumno/agregar";
	}
	
	@PostMapping("/alumno/agregar")
	public String agregar(Model model, @ModelAttribute Alumno alumno, HttpSession sesion) {
		boolean res = servicioAlumno.agregar(alumno, sesion);
		if(res) {
			return "redirect:/alumno/agregar";
		}
		model.addAttribute("error", servicioAlumno.getMensaje());
		return "/alumno/agregar";
	}
	
	
	
}
