package n3ex1.models;

public class NoticiaTenis extends Noticia {
    private String competicio;
    private String tenistes;

    public NoticiaTenis(String titular, String text, String competicio, String tenistes) {
        super(titular, text);
        this.puntuacio = calcularPuntsNoticia();
        this.preu = calcularPreuNoticia();
        this.competicio = competicio;
        this.tenistes = tenistes;
    }

    public String getCompeticio() {
        return competicio;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public String getTenistes() {
        return tenistes;
    }

    public void setTenistes(String tenistes) {
        this.tenistes = tenistes;
    }

    public int calcularPreuNoticia() {
        int preuNoticia = 150;
        String[]  paraulesClau = { "Federer" , "Nadal" , "Djokovic" };
        int[] preuParaulesClau = {100, 100, 100};
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
        String[]  paraulesClau = { "Federer" , "Nadal" , "Djokovic" };
        byte[] puntsParaulesClau = {3, 3, 3};
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
        return "NoticiaTenis [competicio=" + competicio + ", tenistes=" + tenistes + ", titular=" + titular + ", text="
                + text + ", puntuacio=" + puntuacio + ", preu=" + preu + "]";
    }




}


