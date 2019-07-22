package edu.educacionit.model;

import java.util.UUID;

public class Chofer {
	private UUID id;
	private String nombre;
	private String apellido;
	private boolean lesGustaSuTrabajo;
	private int cantAccidentes;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public boolean isLesGustaSuTrabajo() {
		return lesGustaSuTrabajo;
	}
	public void setLesGustaSuTrabajo(boolean lesGustaSuTrabajo) {
		this.lesGustaSuTrabajo = lesGustaSuTrabajo;
	}
	public int getCantAccidentes() {
		return cantAccidentes;
	}
	public void setCantAccidentes(int cantAccidentes) {
		this.cantAccidentes = cantAccidentes;
	}
	
	public Chofer() {
		id = UUID.randomUUID();
	}

}
