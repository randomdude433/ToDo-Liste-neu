package de.dhbw;

public class Aufgabe {
    private String description;
    private Datum toDoUntil;

    public String getDescription(){
        return (this.description);
    }
    public Datum getToDoUntil(){
        return (this.toDoUntil);

    }
    public void setDescription(String description){
        this.description = description;

    }
    public void setToDoUntil(Datum datum){
        this.toDoUntil = datum;

    }

}
