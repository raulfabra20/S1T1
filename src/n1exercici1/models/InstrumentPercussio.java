package n1exercici1.models;

public class InstrumentPercussio extends Instrument {

    public InstrumentPercussio(String nom, int preu) {
        super(nom, preu);

    }

    public void tocar() {
        System.out.println("Està sonant un instrument de percussió.");

    }

    public static void metodeTocarEstatic(){
        System.out.println("Està sonant un instrument de percussió.");
    }

}
