package org.example.composant;

public abstract class Boisson {
    protected String description;            // protected : accessible dans les classes dérivées

    public String getDescription() {
        return description;
    }

    public abstract double cout();
}