package org.example.composant;

public class Espresso extends Boisson {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cout() {
        return 10;        // le prof ne donne pas le prix à l'oral, j'ai mis 10
    }
}