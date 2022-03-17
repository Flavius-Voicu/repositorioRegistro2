package org.flavius.repRegistro.model;

import java.util.LinkedHashMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Colecciones {

	public static LinkedHashMap<String,String[]> datosNavegacion = new LinkedHashMap<String,String[]>();
	public static SortedMap<String, String> listaGenerosOrdenada = new TreeMap<String, String>();

	static {
		 datosNavegacion.put("1", new String[]{"paso1", "/img/Number-1-icon.png", "Datos personales"});
		 datosNavegacion.put("2", new String[]{"paso2", "/img/Number-2-icon.png", "Datos profesionales"});
		 datosNavegacion.put("3", new String[]{"paso3", "/img/Number-3-icon.png", "Datos bancarios"});	
		 datosNavegacion.put("4", new String[]{"resumen", "/img/checkered-flag-icon.png", "Resumen"});
		 
		listaGenerosOrdenada.put("H", "Hombre");
		listaGenerosOrdenada.put("M", "Mujer");
		listaGenerosOrdenada.put("O", "Otro");
	}
}
