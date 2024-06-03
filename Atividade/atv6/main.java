package atv6;

import java.util.Scanner;

public class main{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        tempcelsius tempo = new tempcelsius(0.0f);

        float newtempo;
        newtempo = ler.nextFloat();
        tempo.setnum1(newtempo);

        tempo.convertetempo();


    }

}

