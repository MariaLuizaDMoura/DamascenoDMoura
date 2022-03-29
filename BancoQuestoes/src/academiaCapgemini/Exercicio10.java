package academiaCapgemini;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
*CAPGEMINI
*PROG003: ACADEMIA CAPGEMINI
*Data: 20/02/2022
*Autor:Maria Luiza Moura
*Função: Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra
* podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que
* encontre o número de pares de substrings que são anagramas.
*/


public class Exercicio10 {
	Scanner leia = new Scanner(System.in);

	static int anagrams(String frase) {
		Map<String, Integer> hashMap = new HashMap<>();
		for (int x = 0; x < frase.length(); x++) {
			for (int j = x; j < frase.length(); j++) {
				char[] substrings = frase.substring(x, j + 1).toCharArray();
				Arrays.sort(substrings);
				
//				
				String novaFrase = new String(substrings);

				if (hashMap.containsKey(novaFrase)) {
					hashMap.put(novaFrase, hashMap.get(novaFrase) + 1);
				} else {
					hashMap.put(novaFrase, 1);
				}
			}
		}
		int anagramPairs = 0;
		for (String newPhrase : hashMap.keySet()) {
			int x = hashMap.get(newPhrase);
			anagramPairs += (x * (x - 1)) / 2;
		}
		return anagramPairs;
	}

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner leia = new Scanner(System.in);

		System.out.print("Olá usuário, escreva uma frase:");
		String frase = leia.next();

		System.out.print(anagrams(frase) + " Possibilidades de anagramas");

	}

}