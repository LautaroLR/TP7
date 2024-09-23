package ej1;

import java.util.ArrayList;

public class ProductoQuimico {
//CONSIGNA
	/*
	 * Un producto químico tiene asociado un nombre, un conjunto cultivos donde se
	 * desaconseja su uso, y un conjunto de estados patológicos que pueden
	 * observarse sobre los cultivos, y que es capaz de tratar.
	 */
//ATRIBUTOS
	private String nombre;
	private ArrayList<Cultivo> noRecomendados;
	private ArrayList<String> estadosPatologicos;

//CONSTRUCTOR	
	public ProductoQuimico(String nombre) {
		super();
		this.nombre = nombre;
		this.noRecomendados = new ArrayList<Cultivo>();
		this.estadosPatologicos = new ArrayList<String>();
	}

//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

//MÉTODOS DE INSTANCIA
	
	public void addNoRecomendado(Cultivo cc) {
		if (!noRecomendados.contains(cc))
			noRecomendados.add(cc);
	}

	public void addEstadoPatologico(String ss) {
		if (!estadosPatologicos.contains(ss))
			estadosPatologicos.add(ss);
	}
	
	public boolean equals(Object obj) {
		try {
			ProductoQuimico otro = (ProductoQuimico)obj;
			return this.nombre==otro.getNombre(); 
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public boolean trataEstadoPatologico (String sintoma) {
		return this.estadosPatologicos.contains(sintoma);
	}
	
	public String toString() {
		return "Producto Químico [nombre=" + nombre + ", No recomendados=" + noRecomendados + "]";
	}
	
	public boolean esContraindicado (Cultivo cc) {
		return noRecomendados.contains(cc);
	}

}
