package atv2;

public class	Subtracao{
	private int num1;
	private int num2;
	
	Subtracao(){
		this.setnum1(0);
		this.setnum2(0);
			
	}
	
	public void setnum1(int numero1){
		this.num1 = numero1;
	}
	
	public int getnum1(){
		return this.num1;
	}
	


	public void setnum2(int numero2){
		this.num2 = numero2;
	}
	
	public int getnum2(){
		return this.num2;
	}

	public void imprimeSub(){

		System.out.println("O resultado da subtracao eh: "+ (getnum1() - getnum2()));
		
	}
	
	
	
}