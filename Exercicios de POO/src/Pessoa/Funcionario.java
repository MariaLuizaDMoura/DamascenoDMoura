package Pessoa;

public class Funcionario extends Pessoa {
	private int idFunc;
	private String cargoFunc;
	private double salarioFunc;
	
	public Funcionario(String rg, String nome, int idFunc, String cargoFunc, double salarioFunc) {
		super(rg,nome);
		this.idFunc = idFunc;
		this.cargoFunc = cargoFunc;
		this.salarioFunc = salarioFunc;
	}
	
	public Funcionario(){}
	
	public int getIdFunc() {
		return idFunc;
	}
	public String getCargoFunc() {
		return cargoFunc;
	}
	public double getSalarioFunc() {
		return salarioFunc;
	}
	public void setIdFunc(int idFunc) {
		this.idFunc = idFunc;
	}
	public void setCargoFunc(String cargoFunc) {
		this.cargoFunc = cargoFunc;
	}
	public void setSalarioFunc(double salarioFunc) {
		this.salarioFunc = salarioFunc;
	}
	
	public void imprime() {
		super.imprime();
		System.out.println("Id. ....: "+ this.idFunc);
		System.out.println("Cargo ..: "+ this.cargoFunc);
		System.out.println("Salario.: "+ this.salarioFunc);
	}
	
	@Override
	public String fraseBoa() {
		return "Você codifica os Apps da minha vida!";
	}	
}