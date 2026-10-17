package org.example.decorator;

import org.example.composant.Boisson;

public abstract class DecorateurBoisson extends Boisson {   // héritage
    protected Boisson boisson;                               // composition (agrégation)

    public DecorateurBoisson(Boisson boisson) {              // on ne peut pas créer un décorateur seul
        this.boisson = boisson;
    }
}