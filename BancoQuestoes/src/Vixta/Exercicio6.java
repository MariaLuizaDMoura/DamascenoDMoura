package Vixta;

import java.util.stream.IntStream;

/*
*VIXTA
*PROG006: Avaliação VIXTA
*Data: 07/02/2022
*Autor:Maria Luiza Moura
*Função: Crie uma função chamada "playFizzBuzz" que possui como argumento um número ("N").

A função deverá passar por todos os números menores e igual a N e para cada número imprimir algo diferente de acordo com as regras abaixo.

- Se o número é múltiplo de 3, imprimir no console "Fizz"
- Se o número é múltiplo de 4, imprimir no console "Buzz"
- Se o número é múltiplo de 3 e 4 ao mesmo tempo, imprimir no console "FizzBuzz"
- Se o número não é múltiplo de nenhum dos números acima, imprimir no console o próprio número.*/
public class Exercicio6 {

	public static void main(String[] args) 
	  {
	    fizzBuzz1(100);
	    fizzBuzz2(100);
	  }
	 
	  private static void fizzBuzz1(int num) 
	  {
	    for (int i = 1; i <= num; i++) 
	    {
	      if (((i % 3) == 0) && ((i % 4) == 0)) // É um múltiplo de 3 e 4?
	        System.out.println("fizzbuzz");
	      else if ((i % 3) == 0) // É um múltiplo de 3?
	        System.out.println("fizz");
	      else if ((i % 4) == 0) // É um múltiplo de 4?
	        System.out.println("buzz");
	      else
	        System.out.println(i); // Não é múltiplo de 3 ou 5
	    }
	  }
	 
	  private static void fizzBuzz2(int num) {
	    IntStream.rangeClosed(1, 100)
	        .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
	        .forEach(System.out::println);
	  }
	}
//Fizz Buzz é um jogo com o qual as crianças aprendem sobre a divisão.