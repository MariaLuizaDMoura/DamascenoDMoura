package atividades;

public class P3Pre04 {
	public static void main(String [] args) {
		double numerador, denominador;
		double s1 = 0.0; 
		double s2 = 0.0; 
		double s3 = 0.0; 
		double s4 = 0.0;
		
		// primeira soma
		numerador = 1.0;
		denominador = 1.0;
		for(int i=0;i<50;i++) {
			// System.out.println(numerador+"/"+denominador);
			s1 += numerador/denominador; 
			numerador += 2.0;
			denominador++;
		}
		System.out.println("S1 = "+s1);

		// segunda soma
		numerador = 2.0;
		denominador = 50.0;
		for(int i=0;i<50;i++) {
			//System.out.println(numerador+"/"+denominador);
			s2 += numerador/denominador; 
			numerador *= 2.0;
			denominador--;
		}
		System.out.println("S2 = "+s2);
		
		// terceira soma
		numerador = 37;
		denominador = 1;
		for(int i=0;i<37;i++) {
			//System.out.println(numerador+"*"+(numerador+1)+"/"+denominador);
			s3 += numerador*(numerador+1)/denominador; 
			numerador--;
			denominador++;
		}
		System.out.println("S3 = "+s3);

		// quarta soma
		numerador = 1;
		denominador = 1;
		double sinal = 1;
		for(int i=0;i<10;i++) {
			//System.out.println(numerador+"/"+denominador);
			s4 += sinal*numerador/denominador; 
			numerador++;
			denominador = numerador * numerador;
			sinal = sinal * (-1);
		}
		System.out.println("S4 = "+s4);

	}
}