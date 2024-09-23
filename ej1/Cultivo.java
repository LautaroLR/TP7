package ej1;

import java.util.ArrayList;

public class Cultivo {
//CONSIGNA
	/*
	 * Un cultivo, tiene un nombre y una colección de enfermedades frecuentes que lo
	 * pueden afectar. Asimismo, dado un producto químico, los cultivos son capaces
	 * de decir si en algún momento puede serle de utilidad o no, es decir si el
	 * agroquímico puede tratar una de sus enfermedades frecuentes y no se
	 * desaconseja su uso en el cultivo. Se considera que el agroquímico trata una
	 * enfermedad si todos los estados patológicos de la enfermedad están contenidos
	 * por las acciones del producto químico.
	 */
//ATRIBUTOS DE INSTANCIA
	private String nombre;
	private ArrayList<Enfermedad> patologiasFrecuentes;

//CONSTRUCTOR 
	public Cultivo(String nombre) {
		super();
		this.nombre = nombre;
		this.patologiasFrecuentes = new ArrayList<Enfermedad>();
	}

//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void addPatologiaFrecuente(Enfermedad ee) {
		if (!patologiasFrecuentes.contains(ee)) {
			patologiasFrecuentes.add(ee);
		}
	}

	public boolean puedeServir(ProductoQuimico qq) {
		if (!qq.esContraindicado(this)) {
			for (int i = 0; i < patologiasFrecuentes.size(); i++) {
				if (patologiasFrecuentes.get(i).puedeSerTratada(qq)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean equals(Object obj) {
		try {
			Cultivo otro = (Cultivo) obj;
			return this.nombre == otro.getNombre();
		} catch (Exception e) {
			return false;
		}

	}
}
