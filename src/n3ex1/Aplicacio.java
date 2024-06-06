package n3ex1;

import n3ex1.models.*;

import java.util.Scanner;

public class Aplicacio {
    public static void probarAplicacio() {
        Redaccio redaccio = new Redaccio();

        boolean sortir = false;

        do {
            switch (menu()) {
                case 1:
                    introduirRedactor(redaccio);
                    break;
                case 2:
                    eliminarRedactor(redaccio);
                    break;
                case 3:
                    introduirNoticia(redaccio);
                    break;
                case 4:
                    eliminarNoticia(redaccio);
                    break;
                case 5:
                    mostrarNoticiesRedactor(redaccio);
                    break;
                case 6:
                    mostrarPuntuacioNoticia(redaccio);
                    break;
                case 7:
                    mostrarPreuNoticia(redaccio);
                    break;
                case 0:
                    System.out.println("Gràcies per utilitzar l'aplicació.");
                    sortir = true;
                    break;
            }
        } while (!sortir);
    }

    public static byte menu() {

        Scanner sc = new Scanner(System.in);
        byte opcio;
        final byte MINIM = 0;
        final byte MAXIM = 7;

        do {
            System.out.println("\nMENú PRINCIPAL");
            System.out.println("1. Introduir redactor.");
            System.out.println("2. Eliminar redactor.");
            System.out.println("3. Introduir notícia d'un redactor.");
            System.out.println("4. Eliminar notícia d'un redactor.");
            System.out.println("5. Mostrar totes les notícies d'un redactor.");
            System.out.println("6. Calcular puntuació de la notícia.");
            System.out.println("7. Calcular preu de la notícia.");
            System.out.println("0. Sortir de l'aplicació \n");
            opcio = sc.nextByte();
            if (opcio < MINIM || opcio > MAXIM) {
                System.out.println("Escull una opció vàlida");
            }
        } while (opcio < MINIM || opcio > MAXIM);
        return opcio;
    }

    public static void introduirRedactor(Redaccio redaccio) {
        String dni = demanarDni();
        Redactor redactor = redaccio.buscarRedactor(dni);
        if (redactor == null) {
            String nom = demanarNomRedactor();
            redactor = new Redactor(nom, dni);
            redaccio.afegirRedactor(redactor);
            System.out.println("Redactor registrat amb èxit.");
        } else {
            System.out.println("Aquest redactor ja està registrat al sistema.");
        }
    }
    public static String demanarDni(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introdeuix el DNI del redactor/a:");
        String dni = sc.nextLine();
        return dni;
    }
    public static String demanarNomRedactor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdeuix el nom del redactor/a:");
        String nom = sc.nextLine();
        return nom;

    }

    public static void eliminarRedactor(Redaccio redaccio) {
        String dni = demanarDni();
        Redactor redactor = redaccio.buscarRedactor(dni);
        if (redactor != null) {
            redaccio.eliminarRedactor(redactor);
            System.out.println("Redactor eliminat amb èxit.");
        } else {
            System.out.println("Aquest redactor no està registrat al sistema.");
        }
    }
    public static String demanarTitularNoticia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdeuix el titular de la notícia:");
        String titular = sc.nextLine();
        return titular;
    }
    public static String demanarTextNoticia(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdeuix el text de la notícia:");
        String text = sc.nextLine();
        return text;
    }

    public static void introduirNoticia(Redaccio redaccio) {
        String dni = demanarDni();
        Redactor redactor = redaccio.buscarRedactor(dni);
        if (redactor != null) {
            String titular = demanarTitularNoticia();
            Noticia noticia = redactor.buscarNoticia(titular);
            if (noticia == null) {
                String text = demanarTextNoticia();
                Byte opcio = demanarTipusNoticia();
                menuAfegirNoticia(opcio, redactor, titular, text);
            } else {
                System.out.println("Aquesta notícia ja està registrada.");
            }
        } else {
            System.out.println("Aquest redactor no està registrat al sistema.");
        }
    }
    public static byte demanarTipusNoticia(){
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "De quin esport tracta la notícia? Escull una opció: (1. Futbol, 2. Bàsquet, 3.Tenis, 4. F1, 5.Motociclisme)");
        byte opcio = sc.nextByte();
        return opcio;
    }
    public static void menuAfegirNoticia(byte opcio, Redactor redactor, String titular, String text){
        switch (opcio) {
            case 1:
                afegirNoticiaFutbol(redactor, titular, text);
                break;
            case 2:
                afegirNoticiaBasquet(redactor, titular, text);
                break;
            case 3:
                afegirNoticiaTenis(redactor, titular, text);
                break;
            case 4:
                afegirNoticiaF1(redactor, titular, text);
                break;
            case 5:
                afegirNoticiaMotociclisme(redactor, titular, text);
                break;
            default:
                System.out.println("Escull una opció vàlida.");
                break;

        }
    }

    public static void afegirNoticiaFutbol(Redactor redactor, String titular, String text) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A quina competicio fa referencia?");
        String competicio = sc.nextLine();
        System.out.println("A quin club fa referencia?");
        String club = sc.nextLine();
        System.out.println("A quin jugador fa referencia?");
        String jugador = sc.nextLine();
        NoticiaFutbol noticiaFutbol = new NoticiaFutbol(titular, text, competicio, club, jugador);
        redactor.afegirNoticia(noticiaFutbol);
        System.out.println("Noticia de futbol afegida amb èxit.");
    }

    public static void afegirNoticiaBasquet(Redactor redactor, String titular, String text) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A quina competicio fa referencia?");
        String competicio = sc.nextLine();
        System.out.println("A quinclub fa referencia?");
        String club = sc.nextLine();
        NoticiaBasquet noticiaBasquet = new NoticiaBasquet(titular, text, competicio, club);
        redactor.afegirNoticia(noticiaBasquet);
        System.out.println("Noticia de bàsquet afegida amb èxit.");
    }

    public static void afegirNoticiaTenis(Redactor redactor, String titular, String text) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A quina competicio fa referencia?");
        String competicio = sc.nextLine();
        System.out.println("A quins jugadors fa referencia?");
        String jugadors = sc.nextLine();
        NoticiaTenis noticiaTenis = new NoticiaTenis(titular, text, competicio, jugadors);
        redactor.afegirNoticia(noticiaTenis);
        System.out.println("Noticia de tenis afegida amb èxit.");
    }

    public static void afegirNoticiaF1(Redactor redactor, String titular, String text) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A quina escuderia fa referencia?");
        String escuderia = sc.nextLine();
        NoticiaF1 noticiaF1 = new NoticiaF1(titular, text, escuderia);
        redactor.afegirNoticia(noticiaF1);
        System.out.println("Noticia de F1 afegida amb èxit.");
    }

    public static void afegirNoticiaMotociclisme(Redactor redactor, String titular, String text) {
        Scanner sc = new Scanner(System.in);

        System.out.println("A quin equip fa referencia?");
        String equip = sc.nextLine();
        NoticiaMotociclisme noticiaMotociclisme = new NoticiaMotociclisme(titular, text, equip);
        redactor.afegirNoticia(noticiaMotociclisme);
        System.out.println("Noticia de motociclisme afegida amb èxit.");
    }

    public static void eliminarNoticia(Redaccio redaccio) {
        String dni = demanarDni();
        Redactor redactor = redaccio.buscarRedactor(dni);
        if (redactor != null) {
            String titular = demanarTitularNoticia();
            Noticia noticia = redactor.buscarNoticia(titular);
            if (noticia != null) {
                redactor.eliminarNoticia(noticia);
                System.out.println("Noticia eliminada amb èxit.");
            } else {
                System.out.println("La notícia no està registrada al sistema");
            }
        } else {
            System.out.println("Aquest redactor no està registrat al sistema.");
        }

    }

    public static void mostrarNoticiesRedactor(Redaccio redaccio) {
        String dni = demanarDni();
        Redactor redactor = redaccio.buscarRedactor(dni);
        if (redactor != null) {
            redactor.mostrarNoticies();
        } else {
            System.out.println("Aquest redactor no està registrat al sistema.");
        }
    }

    public static void mostrarPuntuacioNoticia (Redaccio redaccio) {
        String dni = demanarDni();
        Redactor redactor = redaccio.buscarRedactor(dni);
        if (redactor != null) {
            String titular = demanarTitularNoticia();
            Noticia noticia = redactor.buscarNoticia(titular);
            if (noticia != null) {
                System.out.println("La puntuació de la notícia és de: "+noticia.getPuntuacio());
            } else {
                System.out.println("Aquesta notícia no està registrada al sistema.");
            }
        } else {
            System.out.println("Aquest redactor no està registrat al sistema.");
        }
    }

    public static void mostrarPreuNoticia (Redaccio redaccio) {
        String dni = demanarDni();
        Redactor redactor = redaccio.buscarRedactor(dni);
        if (redactor != null) {
            String titular = demanarTitularNoticia();
            Noticia noticia = redactor.buscarNoticia(titular);
            if (noticia != null) {
                System.out.println("El preu de la notícia és de: "+noticia.getPreu()+" €.");
            } else {
                System.out.println("Aquesta notícia no està registrada al sistema.");
            }
        } else {
            System.out.println("Aquest redactor no està registrat al sistema.");
        }
    }

}
