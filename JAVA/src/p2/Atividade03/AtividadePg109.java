package p2.Atividade03;

public class AtividadePg109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlunoDisciplina aluno01   = new AlunoDisciplina();
		AlunoDisciplina aluno02   = new AlunoDisciplina(13, 20, 5,10);
		aluno01.setIdAluno(10);
		aluno01.setIdDisciplina(25);
		aluno01.setNotaB1(8);
		aluno01.setNotaB2(10);
		
		System.out.printf("Aluno 01 : IdAluno: %d  IdDisciplina: %d  media aritmética: %.2f  media ponderada: %.2f "
							,aluno01.getIdAluno(), aluno01.getIdDisciplina(), aluno01.mediaAritmetica(), 
							 aluno01.mediaPonderada());
		
		System.out.printf("%nAluno 02 : IdAluno: %d  IdDisciplina: %d  media aritmética: %.2f  media ponderada: %.2f "
							,aluno02.getIdAluno(), aluno02.getIdDisciplina(), aluno02.mediaAritmetica(), 
							aluno02.mediaPonderada());
	}

}
