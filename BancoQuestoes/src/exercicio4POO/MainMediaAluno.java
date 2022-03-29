package exercicio4POO;

/*
*NAVA
*PROG001: Programa de Formação NAVA JAVA
*Data: 18/02/2022
*Autor:Maria Luiza Moura
*Função: Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com
*uma casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais.
Em seguida, o programa deve mostrar o valor da área do terreno, bem como o valor
do preço do terreno, ambos com duas casas decimais.*/
public class MainMediaAluno {
	public static void main(String[] args) {

		// criando dois alunos
		AlunoDisciplina aluno1 = new AlunoDisciplina();
		@SuppressWarnings("unused")
		AlunoDisciplina aluno2 = new AlunoDisciplina(02, 02, 7, 8);

		aluno1.setIdAluno(03);
		aluno1.setIdDisciplina(03);
		aluno1.setNotaB1(5);
		aluno1.setNotaB2(10);

		// exibindo seus atributos
		System.out.printf("Aluno 1 : IdAluno: %d  IdDisciplina: %d  media aritmética: %.2f  media ponderada: %.2f \n",
				aluno1.getIdAluno(), aluno1.getIdDisciplina(), aluno1.mediaAritmetrica(), aluno1.mediaPonderada());
		
		System.out.printf("Aluno 2 : IdAluno: %d  IdDisciplina: %d  media aritmética: %.2f  media ponderada: %.2f ",
				aluno2.getIdAluno(), aluno2.getIdDisciplina(), aluno2.mediaAritmetrica(), aluno2.mediaPonderada());
	}
}