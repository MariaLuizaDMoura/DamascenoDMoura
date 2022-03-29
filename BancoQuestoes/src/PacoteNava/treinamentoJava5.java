package PacoteNava;
/*
*NAVA
*PROG001: Programa de Formação NAVA JAVA
*Data: 15/03/2022
*Autor:Maria Luiza Moura
*Função: (SomaDez) – Escreva um programa para exibir a soma dos dez primeiros números inteiros.*/
import java.io.IOException;
import java.util.Scanner;
public class treinamentoJava5 {


		
	    public static void main(String[] args) throws IOException {
	        @SuppressWarnings("resource")
			Scanner leitor = new Scanner(System.in);
	        int N = leitor.nextInt();
	        int casaComprado = 0;
	        int casaSobrando = 0;
	        int trabComprado = 0;
	        int trabSobrando = 0;
	        for (int i = 0; i < N; i++) {
	        	String irProTrabalho = leitor.next();
	        	String irPraCasa = leitor.next();
	        	if (irProTrabalho.equalsIgnoreCase("chuva") && casaSobrando == 0) {
	        		casaComprado++;
	        		trabSobrando++;
	        	} else if (irProTrabalho.equalsIgnoreCase("chuva") && casaSobrando > 0) {
	        		trabSobrando++;
	        		casaSobrando--;
	        	}
	        	if (irPraCasa.equalsIgnoreCase("chuva") && trabSobrando == 0) {
	        		trabComprado++;
	        		casaSobrando++;
	        	} else if (irPraCasa.equalsIgnoreCase("chuva") && trabSobrando > 0) {
	        		casaSobrando++;
	        		trabSobrando--;
	        	}
	        }
	        System.out.println(casaComprado + " " + trabComprado);
	    }
		
	}