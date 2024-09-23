package ej1;

public class ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crear instancias de Enfermedad
		Enfermedad e1 = new Enfermedad("Cochinilla");
		e1.addPatologia("Deshidratación");
		e1.addPatologia("Hojas amarillas");

		Enfermedad e2 = new Enfermedad("Roya del trigo");
		e2.addPatologia("Hojas marrones");
		e2.addPatologia("Pérdida de vigor");

		Enfermedad e3 = new Enfermedad("Mancha bacteriana");
		e3.addPatologia("Manchas oscuras en hojas");
		e3.addPatologia("Marchitez");

		Enfermedad e4 = new Enfermedad("Podredumbre gris");
		e4.addPatologia("Descomposición de frutos");
		e4.addPatologia("Hojas marchitas");

		// Crear instancias de Cultivo y agregar patologías frecuentes
		Cultivo c1 = new Cultivo("Trigo");
		c1.addPatologiaFrecuente(e2); // Roya del trigo
		c1.addPatologiaFrecuente(e4); // Podredumbre gris

		Cultivo c2 = new Cultivo("Maíz");
		c2.addPatologiaFrecuente(e1); // Cochinilla
		c2.addPatologiaFrecuente(e3); // Mancha bacteriana

		Cultivo c3 = new Cultivo("Girasol");
		c3.addPatologiaFrecuente(e1); // Cochinilla
		c3.addPatologiaFrecuente(e4); // Podredumbre gris

		Cultivo c4 = new Cultivo("Soja");
		c4.addPatologiaFrecuente(e3); // Mancha bacteriana

		Cultivo c5 = new Cultivo("Lino");
		c5.addPatologiaFrecuente(e2); // Roya del trigo

		// Crear instancias de ProductoQuimico
		ProductoQuimico p1 = new ProductoQuimico("AgroMax-200");
		p1.addEstadoPatologico("Hojas amarillas");
		p1.addEstadoPatologico("Pudrición de raíces");
		p1.addNoRecomendado(c5); // Lino

		ProductoQuimico p2 = new ProductoQuimico("FitoCura 3000");
		p2.addEstadoPatologico("Deshidratación");
		p2.addEstadoPatologico("Hojas marrones");
		p2.addNoRecomendado(c1); // Trigo

		ProductoQuimico p3 = new ProductoQuimico("BactoStop");
		p3.addEstadoPatologico("Hojas marchitas");
		p3.addEstadoPatologico("Manchas oscuras en hojas");
		p3.addNoRecomendado(c3); // Girasol
		
		
	}

}
