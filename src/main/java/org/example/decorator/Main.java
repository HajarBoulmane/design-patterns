package org.example.decorator;


import org.example.composant.Boisson;
import org.example.composant.Espresso;
import org.example.composant.Sumatra;

public class Main {
    public static void main(String[] args) {
        // 1) Le premier modèle seul, sans décorateur
        Boisson boisson = new Sumatra();
        System.out.println(boisson.getDescription() + " : " + boisson.cout());
        // Sumatra : 6.0

        boisson = new Espresso();
        System.out.println(boisson.getDescription() + " : " + boisson.cout());

        // 2) On décore avec du chocolat
        boisson = new Sumatra();
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription() + " : " + boisson.cout());
        // Sumatra au chocolat : 7.2

        // 3) On décore encore avec du caramel
        boisson = new Caramel(boisson);
        System.out.println(boisson.getDescription() + " : " + boisson.cout());
        // Sumatra au chocolat au caramel : 8.0

        // 4) Double chocolat : impossible avec les booléens, trivial ici
        boisson = new Chocolat(boisson);
        System.out.println(boisson.getDescription() + " : " + boisson.cout());
        // Sumatra au chocolat au caramel au chocolat : 9.2

        // 5) Tout d'un coup, imbriqué
        Boisson b = new Caramel(new Chocolat(new Sumatra()));
        System.out.println(b.getDescription() + " : " + b.cout());
    }
}