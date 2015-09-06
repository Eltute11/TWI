package ar.edu.unlam.tallerweb.figuras;


public class TrianguloEquilatero {
 
	private double altura;
	private int lado;


	public TrianguloEquilatero(double altura, int lado){
		this.altura = altura;
		this.lado = lado;
	}


	public double area(){
		double area = (lado * altura)/2;
		System.out.println(area);
		return area;
	}
	
	public double perimetro(){
		int trianguloequilatero = 3;
		double perimetro = lado * trianguloequilatero;
		System.out.println(perimetro);
		return perimetro;
	}

}
