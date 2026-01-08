package org.example.TPObservable;

public class ContratObserver implements Observer{
    String id;

    public ContratObserver(String id) {
        this.id = id;
    }

    @Override
    public void onChange(String key, Object data) {
        if(key == "id" && data instanceof String)
        System.out.println("Contrat Observer : " + data);
    }
}
