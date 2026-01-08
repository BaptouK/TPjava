package org.example.TPObservable;

import java.util.List;
import java.util.ArrayList;

public class Observable {
    public List<Observer> observers = new ArrayList<>();

    public void addObserver (Observer obs) {
        this.observers.add(obs);
    }

    public void removeObserver(Observer obs){
        this.observers.remove(obs);
    }

    public <T> void notifyObservers(String key, T data){
        for (Observer obs : this.observers){
            obs.onChange(key, data );
        }
    }
}
