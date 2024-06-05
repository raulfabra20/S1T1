package n3ex1.models;

import java.util.ArrayList;

public class Redactor {
    private String nom;
    private final String DNI;
    private static int sou;
    private ArrayList<Noticia> noticies;

    public Redactor(String nom, String DNI ) {
        this.nom = nom;
        this.DNI = DNI;
        this.sou = 1500;
        this.noticies = new ArrayList<Noticia>();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDni() {
        return DNI;
    }

    public static int getSou() {
        return sou;
    }



    public void afegirNoticia(Noticia noticia) {
        noticies.add(noticia);
    }

    public void eliminarNoticia(Noticia noticia) {
        noticies.remove(noticia);
    }

    public void mostrarNoticies() {
        for(Noticia noticia : noticies) {
            System.out.println(noticia.getTitular());
            System.out.println(noticia.getText());
        }
    }

    public Noticia buscarNoticia(String titular) {
        Noticia noticia = null;
        int i = 0;

        while(i<noticies.size() && noticia == null) {
            if(noticies.get(i).getTitular().equalsIgnoreCase(titular)) {
                noticia = noticies.get(i);
                return noticia;
            }
            i++;
        }
        return noticia;
    }

    @Override
    public String toString() {
        return "Redactor [nom=" + nom + ", DNI=" + DNI + ", noticies=" + noticies + "]";
    }



}
