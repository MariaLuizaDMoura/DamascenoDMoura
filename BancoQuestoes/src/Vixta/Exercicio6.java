package Vixta;

import java.util.stream.IntStream;

/*
*VIXTA
*PROG006: Avalia��o VIXTA
*Data: 07/02/2022
*Autor:Maria Luiza Moura
*Fun��o: Crie uma fun��o chamada "playFizzBuzz" que possui como argumento um n�mero ("N").

A fun��o dever� passar por todos os n�meros menores e igual a N e para cada n�mero imprimir algo diferente de acordo com as regras abaixo.

- Se o n�mero � m�ltiplo de 3, imprimir no console "Fizz"
- Se o n�mero � m�ltiplo de 4, imprimir no console "Buzz"
- Se o n�mero � m�ltiplo de 3 e 4 ao mesmo tempo, imprimir no console "FizzBuzz"
- Se o n�mero n�o � m�ltiplo de nenhum dos n�meros acima, imprimir no console o pr�prio n�mero.*/
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
	      if (((i % 3) == 0) && ((i % 4) == 0)) // � um m�ltiplo de 3 e 4?
	        System.out.println("fizzbuzz");
	      else if ((i % 3) == 0) // � um m�ltiplo de 3?
	        System.out.println("fizz");
	      else if ((i % 4) == 0) // � um m�ltiplo de 4?
	        System.out.println("buzz");
	      else
	        System.out.println(i); // N�o � m�ltiplo de 3 ou 5
	    }
	  }
	 
	  private static void fizzBuzz2(int num) {
	    IntStream.rangeClosed(1, 100)
	        .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
	        .forEach(System.out::println);
	  }
	}
//Fizz Buzz � um jogo com o qual as crian�as aprendem sobre a divis�o.