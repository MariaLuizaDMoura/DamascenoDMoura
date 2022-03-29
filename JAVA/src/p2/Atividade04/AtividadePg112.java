package p2.Atividade04;

public class AtividadePg112 {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora(10, 2);
		

		System.out.printf("Soma %.2f %n",calculadora.somar());
		System.out.printf("Subtração  %.2f %n",calculadora.subtrair());
		System.out.printf("Multiplicação  %.2f %n",calculadora.multiplicar());
		System.out.printf("Divisão  %.2f  %n",calculadora.dividir());
	}
}
