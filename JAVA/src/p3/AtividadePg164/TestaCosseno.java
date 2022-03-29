package p3.AtividadePg164;

public class TestaCosseno {
	public static void main(String[] args) {
		Cosseno c = new Cosseno();
		c.setX(1.0);
		c.calculaParcelas();
		c.somaParcelas();
		System.out.println(c.getCosseno());
		System.out.println(Math.cos(1.0));
	}
}