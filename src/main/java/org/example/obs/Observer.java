package org.example.obs;

@FunctionalInterface
public interface Observer {
    void update(Observable observable);   // pull : on reçoit la référence, pas la valeur
}