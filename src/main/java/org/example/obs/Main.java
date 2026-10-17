package org.example.obs;

public class Main {
    public static void main(String[] args) {
        ObservableImpl observable = new ObservableImpl();   // la classe, car il faut setState
        Observer o1 = new ObserverImpl1();
        Observer o2 = new ObserverImpl2();

        observable.setState(60);        // personne n'est abonné : rien ne s'affiche

        observable.subscribe(o1);
        observable.subscribe(o2);

        observable.setState(60);        // o1 : 60 / o2 : moyenne 60
        observable.setState(80);        // o1 : 80 / o2 : moyenne 70
        observable.setState(100);       // o1 : 100 / o2 : moyenne 80

        observable.unsubscribe(o2);     // o2 ne reçoit plus rien
        observable.setState(120);       // seul o1 réagit

        // Observateur anonyme
        observable.subscribe(new Observer() {
            @Override
            public void update(Observable observable) {
                if (observable instanceof ObservableImpl obs) {
                    System.out.println("Observer 3 : calcul = "
                            + obs.getState() * Math.cos(obs.getState()));
                }
            }
        });

        // Même chose en lambda
        observable.subscribe(observable1 -> {
            if (observable1 instanceof ObservableImpl obs) {
                System.out.println("Observer 4 (lambda) : calcul = "
                        + obs.getState() * Math.cos(obs.getState()));
            }
        });

        observable.setState(150);       // o1, observer 3 et observer 4 réagissent
    }
}