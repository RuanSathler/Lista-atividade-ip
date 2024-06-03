package atv3;


public class Multiplicacao{
	
	private float num1;
	private float num2;
	
	Multiplicacao(){
		this.setnum1(0.0f);
		this.setnum2(0.0f);
	}
	
	
	public void setnum1(float numero1){
		this.num1 = numero1;
	}
	public float getnum1(){
		return this.num1;
	}
	
	
	public void setnum2(float numero2){
		this.num2 = numero2;
	}
	public float getnum2(){
		return this.num2;
	}
	
	
		public void imprimeMultiplicacao(){
		float resultado;
		resultado = (this.getnum1()*this.getnum2());
		System.out.printf("O resultado da multiplicacao eh: %.0f\n", resultado);}
		
		

    

	}




