package n3ex1.models;

public class NoticiaBasquet extends Noticia {
    private String competicio;
    private String club;

    public NoticiaBasquet(String titular, String text, String competicio, String club) {
        super(titular, text);
        this.puntuacio = calcularPuntsNoticia();
        this.preu = calcularPreuNoticia();
        this.competicio = competicio;
        this.club = club;
    }

    public String getCompeticio() {
        return competicio;
    }

    public void setCompeticio(String competicio) {
        this.competicio = competicio;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int calcularPreuNoticia() {
        int preuNoticia = 250;
        String[]  paraulesClau = { "Eurolliga" , "Barça" , "Madrid" };
        int[] preuParaulesClau = {75, 75, 75};
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
        String[]  paraulesClau = { "Eurolliga" , "ACB" , "Barça" , "Madrid" };
        byte[] puntsParaulesClau = {3, 2, 1, 1};
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
        return "NoticiaBasquet [competicio=" + competicio + ", club=" + club + ", titular=" + titular + ", text=" + text
                + ", puntuacio=" + puntuacio + ", preu=" + preu + "]";
    }



}


