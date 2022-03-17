package org.flavius.repRegistro.model;

public class DatosPersonales {
	
	String nombre;
	String apellidos;
	String fechaNac;
	String sigGenero;
	
	public DatosPersonales() {
		
	}
	
	public DatosPersonales(String nombre, String apellidos, String fechaNac, String sigGenero, String sigPais) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNac = fechaNac;
		this.sigGenero = sigGenero;
		this.sigPais = sigPais;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}
	public String getSigGenero() {
		return sigGenero;
	}
	public void setSigGenero(String sigGenero) {
		this.sigGenero = sigGenero;
	}
	public String getSigPais() {
		return sigPais;
	}
	public void setSigPais(String sigPais) {
		this.sigPais = sigPais;
	}
	String sigPais;
	

}
