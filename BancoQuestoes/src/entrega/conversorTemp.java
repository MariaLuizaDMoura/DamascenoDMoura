package entrega;
/*
*NAVA
*PROG001: Programa de Forma��o NAVA JAVA
*Data: 20/03/2022
*Autor:Maria Luiza Moura
*Fun��o: Escreva um programa que, com base em uma temperatura em graus celsius, 
*a converta e exiba em Kelvin (K), R�aumur (Re), Rankine (Ra) e Fahrenheit (F),
* seguindo as f�rmulas:
* F = C * 1.8 + 32;
* K = C + 273.15; 
* Re = C * 0.8; 
* Ra = C * 1.8 + 32 + 459.67*/
public class conversorTemp {
    public static void main(String[] args) {
        double C, K, F, Re, Ra;
        C = 2.43;

        F = C * 1.8 + 32;
        K = C + 273.15;
        Ra = C * 1.8 + 32 + 459.67;
        Re = C * 0.8;

        System.out.println("A temperatura em Fahrenheit �: " + F);
        System.out.println("A temperatura em Kelvin �: " + K);
        System.out.println("A temperatura em Reaumur �: " + Ra);
        System.out.println("A temperatura em Rankine �: " + Re);
    }
}

