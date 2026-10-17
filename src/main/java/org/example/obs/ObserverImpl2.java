package org.example.obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> history = new ArrayList<>();

    @Override
    public void update(Observable observable) {
        if (history.size() < 100) {                        // c'est l'observateur qui décide de pull ou non
            if (observable instanceof ObservableImpl obs) {
                history.add(obs.getState());
                int sum = 0;
                for (int i = 0; i < history.size(); i++) {
                    sum += history.get(i);
                }
                System.out.println("Observer 2 : moyenne = " + (double) sum / history.size());
            }
        }
    }
}