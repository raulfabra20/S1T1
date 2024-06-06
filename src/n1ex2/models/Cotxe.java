package n1ex2.models;

public class Cotxe {
    private static final String marca = "Nissan";
    private static String model;
    private final int potencia;

    public Cotxe(String model, int potencia) {
        this.model = model;
        this.potencia = potencia;
    }
    public static String getMarca(){
        return marca;
    }

    public  int getPotencia(){
        return potencia;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Cotxe.model = model;
    }

    public static void frenar() {
        System.out.println("El vehícle està frenant.");
    }

    public void accelerar() {
        System.out.println("El vehícle està accelerant.");
    }

    @Override
    public String toString() {
        return "Cotxe{" + "Marca = " + marca +
                ", Model = " + model +
                ", Potencia = " + potencia +
                '}';
    }
}

