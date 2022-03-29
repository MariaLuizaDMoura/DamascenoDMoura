package atividades;

public class Circulo {
	// atributo
	private double raio;
	
	// contrutores
	public Circulo() {}
	public Circulo(double raio) {
		this.raio = raio;
	}
	// getters
	public double getRaio() {return this.raio;}
	
	// setters
	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	// métodos próprios da classe
	public double getArea() {
		return Math.PI * raio * raio;
	}
	
	public double getPerimetro() {
		return 2 * Math.PI * raio;
	} 
}