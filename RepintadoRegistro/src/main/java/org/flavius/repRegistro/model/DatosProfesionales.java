package org.flavius.repRegistro.model;

public class DatosProfesionales {

		String departamento;
		String salario;
		String comentario;
		
		public DatosProfesionales(){
			
		}
		
		public DatosProfesionales(String departamento, String salario, String comentario) {
			super();
			this.departamento = departamento;
			this.salario = salario;
			this.comentario = comentario;
		}
		
		public String getDepartamento() {
			return departamento;
		}
		public void setDepartamento(String departamento) {
			this.departamento = departamento;
		}
		public String getSalario() {
			return salario;
		}
		public void setSalario(String salario) {
			this.salario = salario;
		}
		public String getComentario() {
			return comentario;
		}
		public void setComentario(String comentario) {
			this.comentario = comentario;
		}
		
		
	
}
