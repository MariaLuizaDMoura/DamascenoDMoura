package p5.AtividadePg261;

public class Contas {

	public static void main(String[] args) {
		Contas.mostrarCalculo(new Soma(), 5, 5);
		Contas.mostrarCalculo(new Subtracao(), 5, 5);
		Contas.mostrarCalculo(new Multiplicacao(), 5, 5);
		Contas.mostrarCalculo(new Divisao(), 5, 5);
	}
	
	public static void mostrarCalculo(OperacaoMatematica operacao, double x, double y) {
		System.out.println("O resultado é: " + operacao.calcular(x, y));
	}
}
