package n1exercici1.models;

public abstract class Instrument {
    protected String nom;
    protected int preu;

    public Instrument(String nom, int preu) {
        super();
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPreu() {
        return preu;
    }

    public void setPreu(int preu) {
        this.preu = preu;
    }

    protected abstract void tocar();


}

