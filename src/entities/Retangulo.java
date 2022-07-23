package entities;

public class Retangulo {
	
	public double altura;
	public double largura;
	
	public double area() {
		return this.altura * this.largura;
	}
	
	public double perimetro() {
		return (this.altura * 2) + (this.largura * 2);
	}
	
	public double diagonal() {
		return Math.sqrt((altura*altura) + (largura*largura));
	}
	
	

}
