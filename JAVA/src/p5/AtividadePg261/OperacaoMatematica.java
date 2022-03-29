package p5.AtividadePg261;

public abstract class OperacaoMatematica {
	//Atributos
	protected double number_01;
	protected double number_02;
	//Contrutores
	public OperacaoMatematica() {
		
	}
	public OperacaoMatematica(double number_01, double number_02) {
		this.number_01 = number_01;
		this.number_02 = number_02;
	}
	//Get
	public double getNumber_01() {
		return number_01;
	}
	public double getNumber_02() {
		return number_02;
	}
	//Set
	public void setNumber_01(double number_01) {
		this.number_01 = number_01;
	}
	public void setNumber_02(double number_02) {
		this.number_02 = number_02;
	}
	//Metodos Proprios
	public abstract double calcular(double x, double y);
}
