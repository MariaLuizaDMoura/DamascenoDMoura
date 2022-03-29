package p3.AtividadePg162;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import java.util.Random;

public class TestaPesquisa {
	static Scanner lerTeclado = new Scanner(System.in);
	static Random maria = new Random(new Date().getTime());
	
	public static void main(String[] args) {
		ArrayList<Pesquisa> IBOPE = new ArrayList<Pesquisa>();
		
		System.out.print("Qtde. de pessoas pesquisadas..: ");
		int qtdPessoas = Integer.parseInt(lerTeclado.nextLine());
		System.out.print("Tipo (1-digitada 2-simulada...: ");
		int tipoPesquisa = Integer.parseInt(lerTeclado.nextLine());
		
		for(int i=0; i<qtdPessoas;i++) {
			if(tipoPesquisa==1){
				IBOPE.add(getPesquisaManual());
			}
			else {
				IBOPE.add(getPesquisaSimulada());
			}
		}
		
		System.out.println("Qtde. Homens SIM...: "+QHRS(IBOPE));
		System.out.println("Qtde. Mulheres NAO.: "+QMRN(IBOPE));
		System.out.println("% Homens SIM.......: "+PHRS(IBOPE));
		System.out.println("% Mulheres NAO.....: "+PMRN(IBOPE));

	}
	
	public static Pesquisa getPesquisaManual() {
		Pesquisa p = new Pesquisa();
		System.out.println("Pesquisa "+p.getNumPesquisa());
		System.out.print("Sexo (M/F)........:");
		char sexo = lerTeclado.nextLine().charAt(0); 
		System.out.print("Resposta (S/N)....:");
		char resposta = lerTeclado.nextLine().charAt(0);
		p.setSexo(sexo);
		p.setResposta(resposta);
		return p;
	}
	
	public static Pesquisa getPesquisaSimulada() {
		char sexo = maria.nextBoolean()?'M':'F';  
		char resposta = maria.nextBoolean()?'S':'N'; 
		return new Pesquisa(sexo,resposta);
	}
	
	public static int QHRS(ArrayList<Pesquisa> a) {
		int qhrs = 0;
		for(int i=0; i<a.size();i++) {
			Pesquisa p = (Pesquisa) a.get(i);
			if(p.getSexo()=='M' && p.getResposta()=='S') {
				qhrs++;
			}
		}
		return qhrs;
	}
	
	public static int QMRN(ArrayList<Pesquisa> a) {
		int qmrn = 0;
		for(int i=0; i<a.size();i++) {
			Pesquisa p = (Pesquisa) a.get(i);
			if(p.getSexo()=='F' && p.getResposta()=='N') {
				qmrn++;
			}
		}
		return qmrn;
	}
	
	public static double PHRS(ArrayList<Pesquisa> a) {
		double qhrs = 0;
		double qh = 0;
		
		for(int i=0; i<a.size();i++) {
			Pesquisa p = (Pesquisa) a.get(i);
			if(p.getSexo()=='M') {
				qh++;
				if (p.getResposta()=='S') {
					qhrs++;
				}
			}
		}
		return qhrs/qh*100.0;
	}

	public static double PMRN(ArrayList<Pesquisa> a) {
		double qmrn = 0;
		double qm = 0;
		
		for(int i=0; i<a.size();i++) {
			Pesquisa p = (Pesquisa) a.get(i);
			if(p.getSexo()=='F') {
				qm++;
				if (p.getResposta()=='N') {
					qmrn++;
				}
			}
		}
		return qmrn/qm*100.0;
	}
	
}