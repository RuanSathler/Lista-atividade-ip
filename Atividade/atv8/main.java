package atv8;

import java.util.Scanner;

public class main {   

    public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		Media operacao = new Media(0.0f);
		
		float newnum;
		
		newnum = ler.nextFloat();
		operacao.setnum1(newnum);
		
		newnum = ler.nextFloat();
		operacao.setnum2(newnum);
		
		newnum = ler.nextFloat();
		operacao.setnum3(newnum);
		
		newnum = ler.nextFloat();
		operacao.setnum4(newnum);
		
		operacao. imprimeMedia();	
		
		
	}
}
