package n1ex2;

import n1ex2.models.Cotxe;

public class Aplicacio {

    public static void probarMetodesCotxe() {

        Cotxe.frenar();

        Cotxe cotxe1 = new Cotxe("Micra", 110);


        System.out.println(cotxe1.toString());

        cotxe1.accelerar();



    }

}
