package atv6;

public class tempcelsius{
    private float num1;

    tempcelsius(float constructor){
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
        resultado = ((this.getnum1()*9/5) + 32);
        System.out.printf("Temperatura em C: %.1f\n", this.getnum1());
        System.out.printf("Temperatura em F: %.1f\n", resultado);
    }
}