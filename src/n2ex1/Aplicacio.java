package n2ex1;

import n2ex1.models.Smartphone;

import java.util.Scanner;

public class Aplicacio {

    public static void probarSmartphone(){
        Smartphone smartphone = new Smartphone("Iphone", "13");


        System.out.println("Introdueix un número de telèfon:");
        int num = 647125982;
        smartphone.trucar(num);

        smartphone.alarma();
        smartphone.fotografiar();

    }
}
