package n3ex1.models;

public class NoticiaMotociclisme extends Noticia {
    private String equip;

    public NoticiaMotociclisme(String titular, String text, String equip) {
        super(titular, text);
        this.puntuacio = calcularPuntsNoticia();
        this.preu = calcularPreuNoticia();
        this.equip = equip;
    }

    public String getEquip() {
        return equip;
    }

    public void setEquip(String equip) {
        this.equip = equip;
    }

    public int calcularPreuNoticia() {
        int preuNoticia = 100;
        String[]  paraulesClau = { "Honda" , "Yamaha" };
        int[] preuParaulesClau = {50, 50};
        int i;

        for(i=0; i<paraulesClau.length; i++ ) {
            if(text.contains(paraulesClau[i])) {
                preuNoticia += preuParaulesClau[i];
            }
        }
        return preuNoticia;
    }

    public byte calcularPuntsNoticia() {
        byte puntsNoticia = 3;
        String[]  paraulesClau = { "Honda" , "Yamaha" };
        byte[] puntsParaulesClau = {3, 3};
        int i;

        for(i=0; i<paraulesClau.length; i++ ) {
            if(text.contains(paraulesClau[i])) {
                puntsNoticia += puntsParaulesClau[i];
            }
        }
        return puntsNoticia;
    }

    @Override
    public String toString() {
        return "NoticiaMotociclisme [equip=" + equip + ", titular=" + titular + ", text=" + text + ", puntuacio="
                + puntuacio + ", preu=" + preu + "]";
    }




}


