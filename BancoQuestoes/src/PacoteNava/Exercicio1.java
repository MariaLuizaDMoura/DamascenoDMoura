package PacoteNava;

import java.util.Locale;
import java.util.Scanner;

/*
*NAVA
*PROG001: Programa de Forma��o NAVA JAVA
*Data: 06/02/2022
*Autor:Maria Luiza Moura
*Fun��o: Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com
*uma casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais.
Em seguida, o programa deve mostrar o valor da �rea do terreno, bem como o valor
do pre�o do terreno, ambos com duas casas decimais.*/

public class Exercicio1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		double largura = 0.0;
		double comprimento = 0.0;
		double areaRetangulo = 0.0;
		double metroQuadrado = 0.0;
		double valorTotal = 0.00;

		System.out.println("Informe a base:");
		largura = ler.nextDouble();

		System.out.println("Informe a altura:");
		comprimento = ler.nextDouble();

		System.out.println("Informe o valor do m�:");
		metroQuadrado = ler.nextDouble();

		// variavel
		areaRetangulo = largura * comprimento;
		System.out.println("\nA �rea � igual a: " + areaRetangulo);

		// variavel
		valorTotal = areaRetangulo * metroQuadrado;
		System.out.printf("\nO valor do terreno �  R$:\n");
		System.out.printf("%.2f", valorTotal);
		valorTotal = ler.nextDouble();
	}
}
