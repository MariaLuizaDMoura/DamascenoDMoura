package p2.Atividade04;

public class Calculadora {
	//Atributos
	private double memoria = 0;
	private double valor1;
	private double valor2;
	//Construtores
	public Calculadora() {
	}
	public Calculadora(double valor1, double valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		return;
	}
	//Getters
	public double getMemoria() {
		return memoria;
	}
	//Setters
	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}
	//Metodos próprios da classe
	public double somar() {
		double somar = valor1 + valor2;
		return somar;
	}
	public double subtrair() {
		double subtrair = valor1 - valor2;
		return subtrair;
	}
	public double multiplicar() {
		double multiplicar = valor1 * valor2;
		return multiplicar;
	}
	public double dividir(){
		double dividir =  valor1 / valor2;
		return dividir;
	}
	public void exibeDadosAluno() {
		System.out.println( somar() + 
							subtrair() +
							multiplicar() + 
							dividir() );
	}
}
