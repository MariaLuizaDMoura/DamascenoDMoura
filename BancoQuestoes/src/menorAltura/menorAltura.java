package menorAltura;

import java.util.Locale;
import java.util.Scanner;

/*
*NAVA
*PROG001: Programa de Formação NAVA JAVA
*Data: 21/03/2022
*Autor:Maria Luiza Moura
*Função: Definir a menor altura utilizando a FOR*/


public class menorAltura {
	
	Scanner scan = new Scanner(System.in);
	int numPessoas = 2;
	int contador;
	double menorAltura = 0;
	double altura[] = new double[numPessoas];

	public void receberAltura() {
		for (contador = 0; contador < 2; contador++) {
			System.out.println("Informe a altura da " + (contador + 1) + "° pessoa:");
			altura[contador] = scan.nextDouble();
			menorAltura = altura[contador];
		}
	}

	public void analisaAltura() {
		for (contador = 0; contador < 2; contador++) {

			if (altura[contador] < menorAltura) {
				menorAltura = altura[contador];
			}
		}
		System.out.println("A menor altura e : " + menorAltura);
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		menorAltura exer = new menorAltura();
		exer.receberAltura();
		exer.analisaAltura();
	}
}
