package org.example.TPObservable;

public class AccountObserver implements Observer{
    @Override
    public void onChange(String key, Object data) {
        if (key == "amount" && data instanceof Long){
            System.out.println("Account Observer : " + data);
        }
    }

}
