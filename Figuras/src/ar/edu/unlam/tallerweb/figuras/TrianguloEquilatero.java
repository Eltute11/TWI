package ar.edu.unlam.tallerweb.figuras;


public class TrianguloEquilatero {

	private double base; 
	private double altura;
	private int lado;


	public TrianguloEquilatero(double base, double altura, int lado){
		this.base = base;
		this.altura = altura;
		this.lado = lado;
	}


	public double area(){
		double area = base * altura;
		return area;
	}
	
	public double perimetro(){
		int trianguloequilatero = 3;
		double perimetro = lado * trianguloequilatero;
		return perimetro;
	}

}
