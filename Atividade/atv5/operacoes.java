package atv5;

public class operacoes{
	private int numero1;
	private int numero2;
	private int numero3;
	private int numero4;
	
	operacoes(int constructor){
		this.setnum1(constructor);
		this.setnum2(constructor);
		this.setnum3(constructor);
		this.setnum4(constructor);		
	}
	
	public void setnum1(int num1){
		this.numero1 = num1;
	}
	public int getnum1(){
		return this.numero1;
	}
	
	public void setnum2(int num2){
		this.numero2 = num2;
	}
	public int getnum2(){
		return this.numero2;
	}
	
	public void setnum3(int num3){
		this.numero3 = num3;
	}
	public int getnum3(){
		return this.numero3;
	}
	
	public void setnum4(int num4){
		this.numero4 = num4;
	}
	public int getnum4(){
		return this.numero4;
	}
	
	public void imprimeResultado(){
		int resultado;
		resultado = ((this.getnum1()*this.getnum2())+(this.getnum3()-this.getnum4()));
		System.out.println(resultado);

	}
	
	
}