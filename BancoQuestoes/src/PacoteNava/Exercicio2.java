package PacoteNava;

import java.util.Scanner;
/*
*NAVA
*PROG002: Programa de Formação NAVA JAVA
*Data: 06/02/2022
*Autor:Maria Luiza Moura
*Função: Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela
esta duração no formato horas:minutos:segundos*/

public class Exercicio2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);

		int entrada = 0;
		System.out.println("Digite a duração em segundos:");
		entrada =  ler.nextInt();
		int horas = entrada / 3600;
		int minutos = (entrada - (horas * 3600)) / 60;
		int segundos = entrada - (horas * 3600) - (minutos * 60);


		System.out.printf("%d:%d:%d", horas, minutos, segundos);
	}
}