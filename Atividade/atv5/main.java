package atv5;

import java.util.Scanner;

public class main{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		operacoes operacao = new operacoes(0);
		
		int newnum;
		
		newnum = ler.nextInt();
		operacao.setnum1(newnum);
		
		newnum = ler.nextInt();
		operacao.setnum2(newnum);
		
		newnum = ler.nextInt();
		operacao.setnum3(newnum);
		
		newnum = ler.nextInt();
		operacao.setnum4(newnum);
		
		operacao.imprimeResultado();	
		
		
	}
}
