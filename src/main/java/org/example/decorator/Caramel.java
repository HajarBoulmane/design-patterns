package org.example.decorator;


import org.example.composant.Boisson;

public class Caramel extends DecorateurBoisson {
    public Caramel(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au caramel";
    }

    @Override
    public double cout() {
        return 0.8 + boisson.cout();
    }
}