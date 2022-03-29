package PacoteNava;

public class Calculadora {
	private double memoria=0;
	public Calculadora() {}
	public Calculadora(double memoria) {
		this.memoria=memoria;
	}
	public double getMemoria() {
		return this.memoria;
	}
	public void setMemoria(double memoria) {
		this.memoria=memoria;
	}
	public double somar(double valor) {
		return this.memoria += valor;
	}
	public double subtrair(double valor) {
		return this.memoria -= valor;
	}
	public double multiplicar(double valor) {
		return this.memoria *= valor;
	}
	public double dividir(double valor) {
		return this.memoria /= valor;
	}
	public void exibeMemoria() {
		System.out.println("Memória = "+this.memoria);
	}
}