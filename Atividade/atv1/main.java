package atv1;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
		Adicao adicao1 = new Adicao();

		Scanner ler = new Scanner(System.in);
		int lernumero;

		lernumero = ler.nextInt();
		adicao1.setnum1(lernumero);
		
		lernumero = ler.nextInt();
		adicao1.setnum2(lernumero);

		

		adicao1.imprimeResultado();

		
	}	
    
}
