package atividades;

import java.util.Scanner;

public class TestaArray {
	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		// definindo o tamanho do array
		int N;
		do {
			System.out.print("Entre um número inteiro positivo menor que 10..:");
			N = Integer.parseInt(lerTeclado.nextLine());
			if(N<=0 || N>9) {
				System.out.println("Número errado...");
			}
		}while(N<=0 || N>9);

		// carga do array
		int a[] = new int[N];
		for(int i=0; i<a.length;i++) {
			System.out.print("Entre um inteiro..:");
			a[i] =Integer.parseInt(lerTeclado.nextLine()); 
		}
		
		// impressão dos negativos
		for(int i=0; i<a.length; i++) {
			if(a[i]<0) {
				System.out.println(a[i]);
			}
		}

	}
}