package atividades;

import java.util.Scanner;

public class P3Pre01 {

	public static void main(String[] args) {
		Scanner lerTeclado = new Scanner(System.in);
		int qtdPessoas;
		double somaAltura = 0.0;
		for(qtdPessoas=0;qtdPessoas<10;qtdPessoas++) {
			System.out.print("Entre a altura..:");
			double altura = Double.parseDouble(lerTeclado.nextLine());
			somaAltura += altura;
		}
		double mediaAltura = somaAltura / qtdPessoas;
		System.out.println("Altura média = "+mediaAltura);
		lerTeclado.close();
	}
}