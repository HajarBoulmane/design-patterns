package org.example.obs;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(this);               // on s'envoie soi-même, sans la valeur
        }
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();                // chaque changement notifie
    }

    public int getState() {               // appelée par les observateurs (le « pull »)
        return state;
    }
}