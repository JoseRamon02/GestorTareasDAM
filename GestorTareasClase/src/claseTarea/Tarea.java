package claseTarea;

import java.time.LocalDate;

public class Tarea {
	
	//atributos
	
	private String titulo;
	private String descripcion;
	private LocalDate fecha;
	
	
	//getters y setters
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	
	
	//constructores
	
	public Tarea(String titulo, String descripcion, LocalDate fecha) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Tarea [titulo=" + titulo + ", descripcion=" + descripcion + ", fecha=" + fecha + "]";
	}
	
	
}
