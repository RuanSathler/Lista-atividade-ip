package atv7;

public class TempFahrenheit{
    private float num1;

    TempFahrenheit(float constructor){
        this.setnum1(constructor);
    }

    public void setnum1(float numero1){
        this.num1 = numero1;
    }

    public float getnum1(){
        return this.num1;
    }

    public void convertetempo(){
        float resultado;
        resultado = ((this.getnum1()-32)*5/9);
		System.out.printf("Temperatura em F: %.1f\n", this.getnum1());
        System.out.printf("Temperatura em C: %.1f\n", resultado);
        
    }
}