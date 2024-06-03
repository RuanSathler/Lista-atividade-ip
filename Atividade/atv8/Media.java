package atv8;


public class Media{
	private float numero1;
	private float numero2;
	private float numero3;
	private float numero4;
	
	Media(float constructor){
		this.setnum1(constructor);
		this.setnum2(constructor);
		this.setnum3(constructor);
		this.setnum4(constructor);		
	}
	
	public void setnum1(float num1){
		this.numero1 = num1;
	}
	public float getnum1(){
		return this.numero1;
	}
	
	public void setnum2(float num2){
		this.numero2 = num2;
	}
	public float getnum2(){
		return this.numero2;
	}
	
	public void setnum3(float num3){
		this.numero3 = num3;
	}
	public float getnum3(){
		return this.numero3;
	}
	
	public void setnum4(float num4){
		this.numero4 = num4;
	}
	public float getnum4(){
		return this.numero4;
	}
	
	public void  imprimeMedia(){
		float resultado;
		resultado = ((this.getnum1()+this.getnum2()+this.getnum3()+this.getnum4())/4);
		System.out.printf("A media das notas eh: %.2f\n", resultado);

	}
	
	
}