package de.dhbw;


public class ProgrammMain {

    public static void main (String[]args){
        Datum datum1 = new Datum("12", "12", "2012");
        Datum datum2 = new Datum("13", "12", "2012");

        Aufgabe aufgabe1 = new Aufgabe();
        aufgabe1.setToDoUntil(datum1);
        Aufgabe aufgabe2 = new Aufgabe();
        aufgabe2.setToDoUntil(datum2);
        System.out.println(aufgabe1.getToDoUntil().getInGermanFormat());

        Liste liste1 = new Liste();
        liste1.addAufgabe(aufgabe1);
        System.out.println(liste1.getTasks());
        liste1.setName("Name1");

        Benutzer benutzer1 = new Benutzer();
        benutzer1.addList(liste1);
        System.out.println(benutzer1.listen);


        Liste liste2 = new Liste();
        liste2.addAufgabe(aufgabe2);
        System.out.println(liste2.getTasks());
        liste2.setName("Name2");

        benutzer1.addList(liste2);
        //System.out.println();
    }

}
