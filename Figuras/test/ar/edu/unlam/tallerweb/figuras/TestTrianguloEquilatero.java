package ar.edu.unlam.tallerweb.figuras;

import org.junit.Assert;
import org.junit.Test;


public class TestTrianguloEquilatero {

	double altura = 5.0;
	Integer lado = 3 ;
	double area = 7.5;
	double perimetro = 9.0;
	
	@Test
	public void testPerimetroTrianguloEquilatero (){
		
		TrianguloEquilatero te = new TrianguloEquilatero(altura,lado);
		Assert.assertTrue(te.perimetro() == perimetro);
	}
	
	@Test
	public void testAreaTrianguloEquilatero (){
		
		TrianguloEquilatero te = new TrianguloEquilatero(altura,lado);
		Assert.assertTrue(te.area()== area);
		
		
	}

}
