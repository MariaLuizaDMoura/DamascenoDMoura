package atividades;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class P6Pre06 {
	public static void main(String [] args) {
		Scanner ze = new Scanner(System.in);
		ArrayList dados = new ArrayList();
		dados.add("josé");
		dados.add(12);
		dados.add(3.14);
		dados.add(1,"Maria");
		System.out.println("Entre nome...: ");
		String nome = ze.nextLine();
		dados.add(nome);
		System.out.println(dados);
		dados.set(1, "Marianna");
		System.out.println(dados);		
		System.out.println("Size..: "+dados.size());
		System.out.println(dados.get(4));
		System.out.println(dados.indexOf(12));
		System.out.println(dados.lastIndexOf("12"));
		System.out.println(dados.contains("Marianna"));	
		dados.remove("Marianna");
		System.out.println(dados);
		dados.clear();
		System.out.println(dados);
		System.out.println(dados.isEmpty());
	}
}