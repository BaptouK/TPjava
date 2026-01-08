package org.example.TPObservable;

public class EmailObserver implements Observer{

    @Override
    public void onChange(String key,Object data) {
        if (key == "email" && data instanceof String){
            System.out.println("Email Observer a été appelé : " + data );
        }
    }
}
