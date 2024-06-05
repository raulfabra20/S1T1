package n2ex1.models;

public abstract class Telefon {
    protected String marca;
    protected String model;

    public Telefon(String marca, String model) {

        this.marca = marca;
        this.model = model;
    }


    public void trucar(int numero) {
        System.out.println("S'està trucant al " + numero);
    }
}

