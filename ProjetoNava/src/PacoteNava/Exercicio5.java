package PacoteNava;

import java.util.Scanner;
/*
*NAVA
*PROG005: Programa de Forma��o NAVA JAVA
*Data: 06/02/2022
*Autor:Maria Luiza Moura
*Fun��o: Fa�a um programa que leia um n�mero inteiro positivo N (m�ximo = 9) e depois N
n�meros inteiros e armazene-os em um vetor. Em seguida, mostrar na tela todos os
n�meros negativos lidos.*/

public class Exercicio5 {
	public static void main(String[] args) {


		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner num = new Scanner(System.in);
		int x = 0;
		int i = 0;

		System.out.print("Quantos n�meros voc� vai digitar? ");
		x = ler.nextInt();

		int[] numeros = new int[x];
		@SuppressWarnings("unused")
		int maiorNum = 0;

		for (i = 0; i < numeros.length; i++) {
			System.out.print("Digite um n�mero: ");
			numeros[i] = num.nextInt();

		}
		System.out.println("N�meros Negativos:");
		for (i = 0; i < numeros.length; i++) { // length - tamanho
			if (numeros[i] < 0) {
				System.out.println(numeros[i]);
			}
		}
		System.out.println("Fim");
	}
}