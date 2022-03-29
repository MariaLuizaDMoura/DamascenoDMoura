package P4;

public class P4EX4 {
	public static void main(String [] args) {
		System.out.println("Antes de chamar metodoA()");
		metodoA();
		System.out.println("Depois de chamar metodoA()");
	}
	public static void metodoA() {
		try {
			System.out.println("Antes de chamar metodoB()");
			metodoB();
			System.out.println("Depois de chamar metodoB()");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void metodoB() {
		System.out.println("Antes de chamar metodoC()");
		metodoC();
		System.out.println("Depois de chamar metodoC()");
	}
	public static void metodoC() {
		System.out.println("Antes de chamar metodoD()");
		metodoD();
		System.out.println("Depois de chamar metodoD()");
	}
	public static void metodoD() {
		System.out.println("Antes da divisão no metodoD()");
		int n = 10/0;
		System.out.println("Depois da divisão no metodoD()");
	}
	
}
