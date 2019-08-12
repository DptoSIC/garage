package com.julio.garage;


import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

import com.julio.otros.Etiqueta;

@Entity
public class Coche {
	
	private int id;
	private String matricula;
	private String marca;
	private String modelo;
	private Etiqueta etiqueta;
	
	
	
	public Etiqueta getEtiqueta() {
		return etiqueta;
	}
	public void setEtiqueta(Etiqueta etiqueta) {
		this.etiqueta = etiqueta;
	}
	@Id
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo
				+ ", etiqueta=" + etiqueta + "]";
	}
	
	

}
