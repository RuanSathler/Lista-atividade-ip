package atv9;

import java.util.Scanner;

public class main {   
	public static void main(String[] args){
		Salario operacao = new Salario();

		Scanner ler = new Scanner(System.in);
		float lernumero;
		int lernumeroint;

		lernumero = ler.nextFloat();
		operacao.setnum1(lernumero);
		
		lernumeroint = ler.nextInt();
		operacao.setnum2(lernumeroint);
		
		operacao.imprimeSalario ();

		
	}	
}
