package n1exercici1.models;

public class InstrumentCorda extends Instrument {


    public InstrumentCorda(String nom, int preu) {
        super(nom, preu);

    }

    public void tocar() {
        System.out.println("Està sonant un instrument de corda.");

    }

}
