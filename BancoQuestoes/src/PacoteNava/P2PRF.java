package PacoteNava;

public class P2PRF {
	public static void main(String[] args) {
		Calculadora hp = new Calculadora();
		hp.somar(10)     ; hp.exibeMemoria();
		hp.subtrair(5)   ; hp.exibeMemoria();
		hp.multiplicar(3); hp.exibeMemoria();
		hp.dividir(5)    ; hp.exibeMemoria();
		
		// somente um teste
		String sinal = "*";
		switch(sinal) {
		case "+" : System.out.println("+"); break;
		case "-" : System.out.println("-"); break;
		case "*" : System.out.println("*"); break;
		case "/" : System.out.println("/"); break;
		}
	}
}