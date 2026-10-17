package org.example.decorator;

import org.example.composant.Boisson;

public class Chocolat extends DecorateurBoisson {
    public Chocolat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription() + " au chocolat";
    }

    @Override
    public double cout() {
        return 1.2 + boisson.cout();            // son prix + le prix de ce qu'il décore
    }
}