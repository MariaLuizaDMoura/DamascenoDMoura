package Pessoa;

public class Pessoa {
	protected String rg;
	protected String nome;
	
	public Pessoa() {}
	public Pessoa(String rg, String nome) {
		this.rg = rg;
		this.nome = nome;
	}
	
	public String getRg() {
		return rg;
	}
	public String getNome() {
		return nome;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void imprime() {
		System.out.println("------------------------");
		System.out.println("R.G. ...: "+ this.rg);
		System.out.println("Nome ...: "+ this.nome);
	}
	
	public String fraseBoa() {
		return "Você é a luz da minha vida!";
	}
}