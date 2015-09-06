package ar.edu.unlam.tallerweb.figuras;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCuadrado {

	@Test
	public void CalcularPerimetro() {
		System.out.println("Calculando Perimetro");
		Cuadrado C = new Cuadrado(2);
		assertTrue(C.perimetro() == 8);		
	}
	
	@Test
	public void CalcularArea(){
		System.out.println("Calculando Area");
		Cuadrado C = new Cuadrado(2);
		assertTrue(C.area() == 4);
		
	}

}
