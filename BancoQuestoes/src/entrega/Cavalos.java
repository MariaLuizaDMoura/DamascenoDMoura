package entrega;
/*
*NAVA
*PROG001: Programa de Formação NAVA JAVA
*Data: 20/03/2022
*Autor:Maria Luiza Moura
*Função: Escreva um programa para determinar a quantidade de cavalos necessários
* para se levantar uma massa de m quilogramas a uma altura de h metros em t segundos.
* Considere cavalos = (m * h / t) / 745,6999*/

public class Cavalos {

	    public static void main(String[] args) {
	        double m, h, t, cavalos;
	        m = 21;
	        h = 2.2;
	        t = 1.4;

	        cavalos = (m * h / t) / 745.6999;

	        System.out.println("A quantidade de cavalos necessários é " + cavalos);
	    
	}
}


/* Declarar nossas variáveis m, h, t e cavalos como double. 
 * Como não vamos utilizar o Scanner para entrada de dados, 
 * vamos colocar alguns valores aleatórios como massa, altura e tempo. 
 * Em seguida, vamos criar a fórmula que irá calcular quantos cavalos são necessários. 
 * Cavalos será a massa multiplicada pela atura, multiplicada pelo tempo (em segundos),
 *  e tudo isso dividido pela constante 745,699.
 */