package Pessoa;

public class Testa {
	public static void main(String [] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa("111","Kelly");
		p1.setRg("222");
		p1.setNome("Hong");
		
		p1.imprime();
		p2.imprime();
		
		Funcionario f1 = new Funcionario();
		Funcionario f2 = new Funcionario("851","Maria",876,"DevFullStack",15000.0);
		
		f1.setRg("123");
		f1.setNome("Pedro");
		f1.setIdFunc(322);
		f1.setCargoFunc("DBA Oracle");
		f1.setSalarioFunc(12000.0);
		
		f1.imprime();
		f2.imprime();
		
		System.out.println(p1.fraseBoa());
		System.out.println(f1.fraseBoa());
		
		System.out.println(f1.toString());
		System.out.println(p1.toString());
		
		System.out.println(f1.hashCode());
		System.out.println(p1.hashCode());
	}
}