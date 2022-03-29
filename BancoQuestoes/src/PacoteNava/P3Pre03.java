package PacoteNava;

import java.util.Scanner;

public class P3Pre03 {
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		String menorNome=null;
		double menorAltura = 99.0;
		int contador = 0;
		do {
			System.out.print("Entre nome.....:");
			String nome = scanner.nextLine();
			System.out.print("Entre altura...:");
			double altura = Double.parseDouble(scanner.nextLine());
			if(altura < menorAltura) {
				menorAltura = altura;
				menorNome = nome;
			}
			contador++;
		} while(contador<10);
		System.out.println("Menor altura...:" + menorAltura);
		System.out.println("Nome...........:" + menorNome);
	}
}