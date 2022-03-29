package PacoteNava;

import java.io.IOException;/*Este tipo exceção geralmente é utilizada para validar valores de parâmetros 
*que não estão nas condições adequadas ao programa, ou seja, você pode querer
que um parâmetro do seu método que é do tipo inteiro*/
import java.util.Locale;
import java.util.Scanner;

/*
*NAVA
*PROG003: Programa de Formação NAVA JAVA
*Data: 06/02/2022
*Autor:Maria Luiza Moura
*Função: Leia os valores das coordenadas X e Y de um ponto no plano cartesiano. A seguir,
determine qual o quadrante ao qual pertence o ponto (Q1, Q2, Q3 ou Q4). Se o ponto
estiver na origem, escreva a mensagem “ORIGEM”.*/

public class Exercicio3 {
	public static void main(String[] args) throws IOException {
		Locale.setDefault(Locale.US);

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		
		double x = 0.00;
		double y = 0.00;

		System.out.println("Valor de eixo X:");
		x = ler.nextDouble();

		System.out.println("Valor de eixo Y:");
		y = ler.nextDouble();

		if ((x == 0.00) & (y == 0.00)) { // tá no ponto de origem das coordenadas
			System.out.println("Origem");
		} else if (y == 0.00) {
			System.out.println("Eixo X");// tá apenas em x
		} else if (x == 0.00) {
			System.out.println("Eixo Y");// tá apenas em y
		} else if ((x > 0.00) & (y > 0.00)) { // pertence ao primeiro quadrante
			System.out.println("Q1");
		} else if ((x < 0.00) & (y > 0.00)) { // pertence ao segundo quadrante
			System.out.println("Q2");
		} else if ((x < 0.00) & (y < 0.00)) { // pertence ao terceiro quadrante
			System.out.println("Q3");
		} else if ((x > 0.00) & (y < 0.00)) { // pertence ao quarto quadrante
			System.out.println("Q4");
		}

	}
}
