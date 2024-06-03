package atv9;

public class	Salario{
	private float num1;
	private int num2;
	
	Salario(){
		this.setnum1(0.0f);
		this.setnum2(0);
			
	}
	
	public void setnum1(float numero1){
		this.num1 = numero1;
	}
	
	public float getnum1(){
		return this.num1;
	}
	


	public void setnum2(int numero2){
		this.num2 = numero2;
	}
	
	public int getnum2(){
		return this.num2;
	}

	public void imprimeSalario (){
		float resultado;
		resultado = (getnum1() * getnum2());
		System.out.printf("O total do salario eh: %.2f\n", resultado);
		
	}
	
	
	
}