package n1exercici1.models;

public class InstrumentVent extends Instrument {


    public InstrumentVent(String nom, int preu) {
        super(nom, preu);

    }

    public  void tocar() {
        System.out.println("Està sonant un instrument de vent.");

    }
    public static void metodeTocarEstatic(){
        System.out.println("Està sonant un instrument de vent.");
    }
}
