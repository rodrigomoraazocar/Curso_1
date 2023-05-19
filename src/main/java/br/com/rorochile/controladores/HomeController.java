package br.com.rorochile.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * 
 * @author Rodrigo Mora Azocar
 *
 */

//Primer Anotación
@Controller
@RequestMapping("/")
public class HomeController {

	// Método
	@GetMapping("/")
	@ResponseBody
	public String home() {

		return "Hola Mundo con Spring Boot - Rodrigo Mora Azocar";
	}

	
	@GetMapping("/nosotros")
	@ResponseBody
	public String nosotros() {

		return " Nosotros - Spring Boot";
	}
	
	@GetMapping("/parametros/{id}/{slug}")
	@ResponseBody
	public String  parametros(@PathVariable("id") Long id, @PathVariable("slug") String slug) {
		
		return "id="+id+"  | slug="+slug;
	}

}