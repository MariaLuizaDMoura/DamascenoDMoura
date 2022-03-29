package p4.AtividadePg211;

public abstract class Pessoa {
	protected int id;
	protected String nome;
	public Pessoa(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	public Pessoa() {
	}
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void imprime();
}