package p2.P02EX05;

public class P02EX05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Relogio r1 = new Relogio();
		Relogio r2 = new Relogio(11,53,10);
		
		r1.setHora(12);
		r1.setMinuto(30);
		r1.setSegundo(30);
		
		r1.exibeHorario();
		r2.exibeHorario();
		
		String clock = r1.getHora()   + ":" +
		               r1.getMinuto() + ":" +
				       r1.getSegundo();
		
		System.out.println(">>"+clock+"<<");
		System.out.println("----------------------");
		r1.exibeHorario();
		r1.adiantar(86400);
		r1.exibeHorario();
	}

}
