package entrega;

import java.util.Scanner;

/*
*NAVA
*PROG001: Programa de Formação NAVA JAVA
*Data: 20/03/2022
*Autor:Maria Luiza Moura
*Função: Escreva um programa para calcular e exibir o dia e o mês de PASCOA
* para um dado ano informado na variável ANO, usando o algoritmo de JEAN MEEUS.
* Todas as variáveis devem ser inteiras.*/

public class Pascoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a, b, c, d, e, f, g, h, i, j, k, L, MES, DIA;
		System.out.println("Digite o Ano");
		int ANO = sc.nextInt();

		a = ANO % 19;
		b = Math.floor(ANO / 100);
		c = ANO % 100;
		d = Math.floor(b / 4);
		e = b % 4;
		f = Math.floor((b + 8) / 25);
		g = Math.floor((b - f + 1) / 3);
		h = (19 * a + b - d - g + 15) % 30;
		i = Math.floor(c / 4);
		j = c % 4;
		k = (32 + 2 * e + 2 * i - h - j) % 7;
		L = Math.floor((a + 11 * h + 22 * k) / 451);
		MES = Math.floor((h + k - 7 * L + 114) / 31);
		DIA = ((h + k - 7 * L + 114) % 31) + 1;

		int mes = (int) MES;
		int dia = (int) DIA;
		System.out.println(dia + "/" + mes + "/" + ANO);
		sc.close();
	}

}
