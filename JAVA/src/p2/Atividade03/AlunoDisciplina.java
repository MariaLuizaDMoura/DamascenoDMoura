package p2.Atividade03;

public class AlunoDisciplina {
	//Atributos
	private int idAluno;
	private int idDisciplina;
	private double notaB1;
	private double notaB2;
	//Contrutores
	public AlunoDisciplina() {
	}
	public AlunoDisciplina(int idAluno, int idDisciplina, double notaB1, double notaB2) {
		this.idAluno = idAluno;
		this.idDisciplina = idDisciplina;
		this.notaB1 = notaB1;
		this.notaB2 = notaB2;
	}
	//Getters
	public int getIdAluno() {
		return idAluno;
	}
	public int getIdDisciplina() {
		return idDisciplina;
	}
	public double getNotaB1() {
		return notaB1;
	}
	public double getNotaB2() {
		return notaB2;
	}
	//Setters
	public void setIdAluno(int idAluno) {
		this.idAluno = idAluno;
	}
	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}
	public void setNotaB1(double notaB1) {
		this.notaB1 = notaB1;
	}
	public void setNotaB2(double notaB2) {
		this.notaB2 = notaB2;
	}
	//Métodos próprios da Classe
	public double mediaAritmetica(){
		double mediaAritmetica = (notaB1 + notaB2) / 2 ;
		return mediaAritmetica;
	}
	public double mediaPonderada(){
		double mediaPonderada = (4 * notaB1) + (notaB2 * 6) / (4 + 6);
		return mediaPonderada;
	}
	public void exibeDadosAluno() {
		System.out.println(idAluno
							+ idDisciplina 
							+ mediaAritmetica() 
							+ mediaPonderada() );
	}
}
