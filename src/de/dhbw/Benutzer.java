package de.dhbw;

import java.util.ArrayList;

public class Benutzer {
    private String name;
    public ArrayList<Liste>listen = new ArrayList<>();

    public void setName (String name){
        this.name = name;

    }
    public void addList (Liste liste){
        this.listen.add(liste);
        //wem wollen wir was zuordnen?
        liste.setOwner(this);

    }


}
