package JavaBasico;

public class P1EX04 {
	public static void main(String[] args) {
		int hora    = 4;
		int minuto  = 50;
		int segundo = 20;
		int passou  = hora * 3600 + minuto * 60 + segundo;
		int faltam  = 86400 - passou;
		System.out.println("Já se passaram " + passou + " segundos.");
		System.out.println("Faltam " + faltam + " segundos.");
	}
}