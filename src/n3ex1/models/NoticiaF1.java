package n3ex1.models;

public class NoticiaF1 extends Noticia {
    private String escuderia;

    public NoticiaF1(String titular, String text, String escuderia) {
        super(titular, text);
        this.puntuacio = calcularPuntsNoticia();
        this.preu = calcularPreuNoticia();
        this.escuderia = escuderia;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    public int calcularPreuNoticia() {
        int preuNoticia = 100;
        String[]  paraulesClau = { "Ferrari" , "Mercedes" };
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
        byte puntsNoticia = 4;
        String[]  paraulesClau = { "Ferrari" , "Mercedes" };
        byte[] puntsParaulesClau = {2, 2};
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
        return "NoticiaF1 [escuderia=" + escuderia + ", titular=" + titular + ", text=" + text + ", puntuacio="
                + puntuacio + ", preu=" + preu + "]";
    }




}




