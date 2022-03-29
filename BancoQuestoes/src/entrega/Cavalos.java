package entrega;
/*
*NAVA
*PROG001: Programa de Forma��o NAVA JAVA
*Data: 20/03/2022
*Autor:Maria Luiza Moura
*Fun��o: Escreva um programa para determinar a quantidade de cavalos necess�rios
* para se levantar uma massa de m quilogramas a uma altura de h metros em t segundos.
* Considere cavalos = (m * h / t) / 745,6999*/

public class Cavalos {

	    public static void main(String[] args) {
	        double m, h, t, cavalos;
	        m = 21;
	        h = 2.2;
	        t = 1.4;

	        cavalos = (m * h / t) / 745.6999;

	        System.out.println("A quantidade de cavalos necess�rios � " + cavalos);
	    
	}
}


/* Declarar nossas vari�veis m, h, t e cavalos como double. 
 * Como n�o vamos utilizar o Scanner para entrada de dados, 
 * vamos colocar alguns valores aleat�rios como massa, altura e tempo. 
 * Em seguida, vamos criar a f�rmula que ir� calcular quantos cavalos s�o necess�rios. 
 * Cavalos ser� a massa multiplicada pela atura, multiplicada pelo tempo (em segundos),
 *  e tudo isso dividido pela constante 745,699.
 */