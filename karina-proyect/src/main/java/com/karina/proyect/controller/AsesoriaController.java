package com.karina.proyect.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.karina.proyect.model.Asesoria;
import com.karina.proyect.servicios.AsesoriaServicio;

@Controller
public class AsesoriaController {
	

	@Autowired
	private AsesoriaServicio servicio;
	
	@GetMapping({"/asesorias/listar"})
	public String listarAsesorias(Model modelo) {
		modelo.addAttribute("asesorias", servicio.listarTodosLasAsesorias());
		return "asesorias/listar"; 
	}
	
	@GetMapping("/asesorias/datos")
	public String CrearAsesoria(Model model) {
		Asesoria aseso = new Asesoria();
		model.addAttribute("asesorias", aseso);
		return "asesorias/listar";
	}
	
	@PostMapping("/estudiantes")
	public String guardaAsesoria(@ModelAttribute("Asesoria") Asesoria Asesoria) {
		servicio.guardarAsesoria(Asesoria);
		return "redirect:asesorias";
	}
}
