package org.example.obs;

public class ObserverImpl1 implements Observer {
    @Override
    public void update(Observable observable) {
        if (observable instanceof ObservableImpl obs) {
            System.out.println("Observer 1 : new state = " + obs.getState());
        }
    }
}