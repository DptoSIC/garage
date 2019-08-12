package com.julio.otros;

public class Etiqueta {
	
	public enum Distintivo { O, ECO, B, C};
	
	
	private Distintivo tipo;
	private String color;
	
	
	public Distintivo getTipo() {
		return tipo;
	}
	public void setTipo(Distintivo tipo) {
		this.tipo = tipo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
	public Etiqueta() {
		super();
	}
	
	public Etiqueta(Distintivo tipo, String color) {
		super();
		this.tipo = tipo;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Etiqueta [tipo=" + tipo + ", color=" + color + "]";
	}
	

}
