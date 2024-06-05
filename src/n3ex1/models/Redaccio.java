package n3ex1.models;

import java.util.ArrayList;

public class Redaccio {
    private ArrayList<Redactor> redactors;


    public Redaccio() {
        this.redactors = new ArrayList<Redactor>();
    }

    public void afegirRedactor(Redactor redactor) {
        redactors.add(redactor);
    }

    public void eliminarRedactor(Redactor redactor) {
        redactors.remove(redactor);
    }

    public Redactor buscarRedactor(String dni) {
        Redactor redactor = null;
        int i = 0;

        while(i<redactors.size() && redactor == null) {
            if(redactors.get(i).getDni().equalsIgnoreCase(dni)) {
                redactor = redactors.get(i);
                return redactor;
            }
            i++;
        }
        return redactor;
    }

}
