package p4.AtividadePg211;

public class Funcionario extends Pessoa {
	protected int idFunc;
	protected String cargo;
	
	public Funcionario() {}
	public Funcionario(int id, String nome, int idFunc, String cargo) {
		super(id, nome);
		this.idFunc = idFunc;
		this.cargo = cargo;
	}
	
	public int getIdFunc() {
		return idFunc;
	}
	public String getCargo() {
		return cargo;
	}
	public void setIdFunc(int idFunc) {
		this.idFunc = idFunc;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public void imprime() {
		System.out.println("Funcionário...: "+nome);
	}

}
