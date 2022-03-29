package PacoteNava;

import java.util.Scanner;
/*
*NAVA
*PROG004: Programa de Forma��o NAVA JAVA
*Data: 06/02/2022
*Autor:Maria Luiza Moura
*Fun��o: Leia um valor inteiro X. Em seguida mostre os �mpares de 1 a X, um valor por linha,
inclusive o X, se for o caso.*/

public class Exercicio4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);

		
		System.out.println("Digite o valor de X:");
		int num = ler.nextInt(); 

		for (int i = 0; i <= num; i++) { 
			if (i % 2 == 1) {
				System.out.println(i);

			}

		}
		System.out.println("Fim");
	}
}

//( <= ) Utilizado quando desejamos verificar se uma vari�vel � menor ou igual � outra.
//( % ) Operador de m�dulo (ou resto da divis�o)
// (++) contador
//(==) Utilizado quando desejamos verificar se uma vari�vel � igual a outra.