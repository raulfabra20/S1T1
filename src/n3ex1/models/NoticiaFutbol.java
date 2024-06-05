package n3ex1.models;

public class NoticiaFutbol extends Noticia {
    private String competicio;
    private String club;
    private String jugador;


    public NoticiaFutbol(String titular, String text, String competicio, String club, String jugador) {
        super(titular, text);
        this.puntuacio = calcularPuntsNoticia();
        this.preu = calcularPreuNoticia();
        this.competicio = competicio;
        this.club = club;
        this.jugador = jugador;

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




    public String getJugador() {
        return jugador;
    }




    public void setJugador(String jugador) {
        this.jugador = jugador;
    }




    public int calcularPreuNoticia() {
        int preuNoticia = 300;
        String[]  paraulesClau = { "Lliga de campions" , "Barça" , "Madrid", "Ferran Torres", "Benzema" };
        int[] preuParaulesClau = {100, 100, 100, 50, 50};
        int i;

        for(i=0; i<paraulesClau.length; i++ ) {
            if(text.contains(paraulesClau[i])) {
                preuNoticia += preuParaulesClau[i];
            }
        }
        return preuNoticia;
    }

    public byte calcularPuntsNoticia() {
        byte puntsNoticia = 5;
        String[]  paraulesClau = { "Lliga de campions" , "Lliga" , "Barça" , "Madrid", "Ferran Torres", "Benzema" };
        byte[] puntsParaulesClau = {3, 2, 1, 1, 1, 1};
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
        return "NoticiaFutbol [competicio=" + competicio + ", club=" + club + ", jugador=" + jugador + ", titular="
                + titular + ", text=" + text + ", puntuacio=" + puntuacio + ", preu=" + preu + "]";
    }




}

