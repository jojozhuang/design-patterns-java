package johnny.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class MessageServer implements Observerable {
    private List<Observer> observers;
    private String message;

    public MessageServer() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if(!observers.isEmpty())
            observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < observers.size(); i++) {
            Observer oserver = observers.get(i);
            oserver.update(message);
        }
    }

    public void setMessage(String s) {
        this.message = s;
        System.out.println("Message Server is updating message: " + s);
        // Notify all observers
        notifyObserver();
    }
}
