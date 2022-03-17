package org.flavius.repRegistro.controller;

import javax.servlet.http.HttpServletRequest;

import org.flavius.repRegistro.model.Colecciones;
import org.flavius.repRegistro.model.DatosBancarios;
import org.flavius.repRegistro.model.DatosPersonales;
import org.flavius.repRegistro.model.DatosProfesionales;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/registro")
public class RegistroController {
	
	@GetMapping("/paso1")
	public ModelAndView devuelvePersonal(HttpServletRequest serv){
		
		ModelAndView mav = new ModelAndView();
		
		DatosPersonales DatosPersonales = new DatosPersonales();
		
		if (serv.getSession().getAttribute("paso1") != null) {
			DatosPersonales = (DatosPersonales)serv.getSession().getAttribute("datosPersonales");
		}

		mav.addObject("pag","1");
		mav.addObject("map", Colecciones.datosNavegacion);
		mav.addObject("DatosPersonales", DatosPersonales);		
		
		mav.setViewName("Paso1");
		return mav;
	}

	@PostMapping("/paso1")
	public ModelAndView recibirPersonal(DatosPersonales DatosPersonales, HttpServletRequest serv){
		
		ModelAndView mav = new ModelAndView();
		
		serv.getSession().setAttribute("DatosPersonales", DatosPersonales);
		mav.addObject("pag","1");
		mav.addObject("map", Colecciones.datosNavegacion);
		mav.addObject("DatosPersonales", DatosPersonales);	
		mav.setViewName("redirect:paso2");
		
		return mav;
		
	}
	
	@GetMapping("/paso2")
	public ModelAndView devuelveProfesional(HttpServletRequest serv){
		
		ModelAndView mav = new ModelAndView();
		
		DatosProfesionales DatosProfesionales = new DatosProfesionales();
		
		if (serv.getSession().getAttribute("paso1") != null) {
			DatosProfesionales = (DatosProfesionales)serv.getSession().getAttribute("datosPersonales");
		}

		mav.addObject("pag","2");
		mav.addObject("map", Colecciones.datosNavegacion);
		mav.addObject("DatosProfesionales", DatosProfesionales);	
		
		
		
		mav.setViewName("Paso2");
		return mav;
	}

	@PostMapping("/paso2")
	public ModelAndView recibirProfesional(DatosProfesionales DatosProfesionales, HttpServletRequest serv){
		
		ModelAndView mav = new ModelAndView();
		
		serv.getSession().setAttribute("DatosProfesionales", DatosProfesionales);
		mav.addObject("pag","2");
		mav.addObject("map", Colecciones.datosNavegacion);
		mav.addObject("DatosProfesionales", DatosProfesionales);
		mav.setViewName("redirect:paso3");
		
		return mav;
		
	}
	
	@GetMapping("/paso3")
	public ModelAndView devuelveBancario(HttpServletRequest serv){
		
		ModelAndView mav = new ModelAndView();
		
		DatosBancarios DatosBancarios = new DatosBancarios();
		
		if (serv.getSession().getAttribute("paso1") != null) {
			DatosBancarios = (DatosBancarios)serv.getSession().getAttribute("datosPersonales");
		}

		mav.addObject("pag","3");
		mav.addObject("map", Colecciones.datosNavegacion);
		mav.addObject("DatosBancarios", DatosBancarios);	
		
		
		
		mav.setViewName("Paso3");
		return mav;
	}

	@PostMapping("/paso3")
	public ModelAndView recibirBancario(DatosBancarios DatosBancarios, HttpServletRequest serv){
		
		ModelAndView mav = new ModelAndView();
		
		serv.getSession().setAttribute("DatosBancarios", DatosBancarios);
		mav.addObject("pag","3");
		mav.addObject("map", Colecciones.datosNavegacion);
		mav.addObject("DatosBancarios", DatosBancarios);
		mav.setViewName("redirect:resumen");
		
		return mav;
		
	}
	
	@GetMapping("/resumen")
	public ModelAndView resumen(HttpServletRequest serv) {
		ModelAndView mav = new ModelAndView();
		
		DatosPersonales DatosPersonales = new DatosPersonales();
		if (serv.getSession().getAttribute("datosPersonales") != null) {
			DatosPersonales = (DatosPersonales)serv.getSession().getAttribute("datosPersonales");
		}
		
		DatosProfesionales DatosProfesionales = new DatosProfesionales();
		if (serv.getSession().getAttribute("datosProfesionales") != null) {
			DatosProfesionales = (DatosProfesionales)serv.getSession().getAttribute("datosProfesionales");
		}
		
		DatosBancarios DatosBancarios = new DatosBancarios();
		if (serv.getSession().getAttribute("datosBancarios") != null) {
			DatosBancarios = (DatosBancarios)serv.getSession().getAttribute("datosBancarios");
		}
		mav.addObject("pag","resumen");
		mav.addObject("map", Colecciones.datosNavegacion);
		mav.addObject("DatosPersonales",DatosPersonales);
		mav.addObject("DatosProfesionales",DatosProfesionales);
		mav.addObject("DatosBancarios",DatosBancarios);
		mav.addObject("datosNavegacion",Colecciones.datosNavegacion);
		mav.setViewName("resumen");
		return mav;
	}
	
}
