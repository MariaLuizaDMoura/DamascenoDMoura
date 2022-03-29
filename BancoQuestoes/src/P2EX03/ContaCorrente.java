package P2EX03;

public class ContaCorrente {
	private int numCC;
	private double saldoCC;
	
	// construtores
	public ContaCorrente() {}
	public ContaCorrente(int numCC, double saldoCC) {
		this.numCC = numCC;
		this.saldoCC = saldoCC;
	}
	
	// getters
	public int getNumCC() {return this.numCC;}
	public double getSaldoCC() {return this.saldoCC;}
	
	// setters
	public void setNumCC(int numCC) {
		this.numCC = numCC;
	}
	
	public void setSaldoCC(double saldoCC) {
		this.saldoCC = saldoCC;
	}
	
	// métodos próprios da classe
	public void depositar(double valor) {
		saldoCC += valor;
	}
	public void sacar(double valor) {
		saldoCC -= valor;
	}
}
