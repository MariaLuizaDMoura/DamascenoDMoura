package atividades;

public class P2EX03 {
	public static void main(String[] args) {
		ContaCorrente cc1 = new ContaCorrente();
		ContaCorrente cc2 = new ContaCorrente(321,3000.0);
		
		cc1.setNumCC(123);
		cc1.setSaldoCC(0);
		
		cc1.depositar(1000.0);
		cc1.sacar(100.0);
		
		cc2.depositar(1000.0);
		cc2.sacar(100.0);
		
		System.out.println(
				"CC número..:" + cc1.getNumCC() +
			   " Saldo......:" + cc1.getSaldoCC()
				);
		
		System.out.println(
				"CC número..:" + cc2.getNumCC() +
			   " Saldo......:" + cc2.getSaldoCC()
				);
	}
}