package atv2;

import java.util.Scanner;

public class main {
	public static void main(String[] args){
		Subtracao sub1 = new Subtracao ();

		Scanner ler = new Scanner(System.in);
		int lernumero;

		lernumero = ler.nextInt();
		sub1.setnum1(lernumero);
		
		lernumero = ler.nextInt();
		sub1.setnum2(lernumero);

		

		sub1.imprimeSub();

	
}	
    
}
