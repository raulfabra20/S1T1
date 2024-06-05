package n2ex1.models;

public  class Smartphone extends Telefon implements Camera, Rellotge {
    public Smartphone(String marca, String model) {
        super(marca, model);

    }



    public void trucar(int numero) {
        System.out.println("S'està trucant al "+numero);
    }


    public void alarma() {
        System.out.println("Està sonant l'alarma.");

    }


    public void fotografiar() {
        System.out.println("S'està fent una foto.");

    }



}


