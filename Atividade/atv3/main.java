package atv3;

import java.util.Scanner;

public class main{
	public static void main(String[] args){

		Multiplicacao mult1 = new Multiplicacao();
		Scanner ler = new Scanner(System.in);
		
		float lernumero;
		lernumero = ler.nextFloat();
		mult1.setnum1(lernumero);
		
		
		lernumero = ler.nextFloat();
		mult1.setnum2(lernumero);
		
		mult1.imprimeMultiplicacao();
	}	
    
}
