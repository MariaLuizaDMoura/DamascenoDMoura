package testePoligonos;

public class TestaPoligonos {
	public static void main(String[] args) {
		Retangulo r = new Retangulo();
		Triangulo t = new Triangulo();
		
		r.setValores(10, 20);
		t.setValores(10, 20);
		
		System.out.println("Área Retangulo.: "+r.area());
		System.out.println("Área Triângulo.: "+t.area());
	}
}