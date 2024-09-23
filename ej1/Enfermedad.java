package ej1;

import java.util.ArrayList;

public class Enfermedad {
//CONSIGNA
	
/*Una enfermedad tiene un nombre asociado y un conjunto de estados patológicos
 *que deben ser tratados. Por ejemplo: Cochinilla (estados patológicos: 
 *deshidratación, hojas amarillas). Aclaración: los estados patológicos 
 *de una enfermedad se corresponden con los estados patológicos que los 
 *productos son capaces de tratar.*/
	
//ATRIBUTOS DE INSTANCIA
	private String nombre;
	private ArrayList<String> patologias;
	
//CONSTRUCTOR
	public Enfermedad(String nombre) {
		super();
		this.nombre = nombre;
		this.patologias = new ArrayList<String>();
	}
//GETTERS Y SETTERS

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void addPatologia(String ss) {
		if (!patologias.contains(ss))
			patologias.add(ss);
	}
	
//MÉTODOS DE INSTANCIA
	
	public boolean tieneSintoma (String sintoma) {
		return patologias.contains(sintoma);
	}
	
	public boolean puedeSerTratada (ProductoQuimico qq) {
		boolean puedeTratar=true;
		for (int i=0; i<patologias.size();i++) {
			if (!qq.trataEstadoPatologico(patologias.get(i))) {
				puedeTratar=false;
			}
		}
		return puedeTratar;
	}
	
	public boolean equals(Object obj) {
		try {
			Enfermedad otra = (Enfermedad)obj;
			return this.nombre==otra.getNombre();
		} catch (Exception e) {
			return false;
		}
	}
}
