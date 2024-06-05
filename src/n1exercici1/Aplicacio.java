package n1exercici1;

import n1exercici1.models.InstrumentCorda;
import n1exercici1.models.InstrumentPercussio;
import n1exercici1.models.InstrumentVent;

public class Aplicacio {


    public void probarMetodesInstruments(){

        InstrumentVent instrumentVent = new InstrumentVent("flauta", 20);
        InstrumentCorda instrumentCorda = new InstrumentCorda("violí", 300);
        InstrumentPercussio instrumentPercussio = new InstrumentPercussio("bateria", 500);

        instrumentVent.tocar();
        instrumentCorda.tocar();
        instrumentPercussio.tocar();


    }

}

