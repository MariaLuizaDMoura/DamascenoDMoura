package P02EX05;
/*
*NAVA
*PROG001: Programa de Formação NAVA JAVA
*Data: 21/03/2022
*Autor:Maria Luiza Moura
*Função: Crie a classe Relogio, de acordo com
o diagrama de classe abaixo. Faça construtores, getters
e setters. Os métodos adiantar e atrasar recebem uma
quantidade em segundos e, respectivamente adiantam
ou atrasam o horário essa quantidade de segundos. O
método exibeHorario exibe o horário no formato
HH:MM:SS. Escreva um programa para testar esta
classe.*/
public class P02EX05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Relogio r1 = new Relogio();
		Relogio r2 = new Relogio(11,53,10);
		
		r1.setHora(12);
		r1.setMinuto(30);
		r1.setSegundo(30);
		
		r1.exibeHorario();
		r2.exibeHorario();
		
		String clock = r1.getHora()   + ":" +
		               r1.getMinuto() + ":" +
				       r1.getSegundo();
		
		System.out.println(">>"+clock+"<<");
		System.out.println("----------------------");
		r1.exibeHorario();
		r1.adiantar(86400);
		r1.exibeHorario();
	}

}
