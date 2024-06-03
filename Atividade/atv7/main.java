package atv7;

import java.util.Scanner;

public class main {   

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        TempFahrenheit tempo = new TempFahrenheit(0.0f);

        float newtempo;
        newtempo = ler.nextFloat();
        tempo.setnum1(newtempo);

        tempo.convertetempo();
    }
}
