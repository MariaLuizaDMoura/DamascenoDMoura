package p4.AtividadePg215;

import java.util.Scanner; 
public class TestaInteiro {
   public static void main (String [] args) {
	   Scanner sc = new Scanner (System.in);
	   boolean erro = true;
	   int numInteiro=0;
	   do {
		   try {
			   System.out.print("Entre idade..: ");
			   numInteiro = sc.nextInt();
			   erro = false;
		   }
		   catch(Exception e) {
			   System.out.println("Este não é um inteiro numérico");
			   erro = true;
			   sc.nextLine();
		   }
	   } while (erro);
	   
	   System.out.print("Você digitou: "+numInteiro);
   }
}