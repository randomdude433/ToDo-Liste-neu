package de.dhbw;

import java.util.ArrayList;

public class Liste {
    private ArrayList<Aufgabe>tasks = new ArrayList<>();
    private String name;
    private Benutzer owner;

    public void addAufgabe (Aufgabe aufgabe){
        this.tasks.add(aufgabe);

    }
    public ArrayList<Aufgabe>getTasks(){
        return tasks;
    }
    public void setName (String name){
        this.name = name;
    }
    public void setOwner (Benutzer owner){
        this.owner = owner;
    }
}
