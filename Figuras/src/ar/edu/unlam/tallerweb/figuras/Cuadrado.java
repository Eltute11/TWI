package ar.edu.unlam.tallerweb.figuras;

public class Cuadrado {
    private double lado;
    private double areaCuadrado;
    private double perimetroCuadrado;

    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    
    public double perimetro() 
    {
    	perimetroCuadrado = 4 * lado;
        return perimetroCuadrado; 
    }
    
    public double area() 
    {
        areaCuadrado = lado * lado;
        return areaCuadrado; 
    }   
     
}