package observer.subjects;

import observer.observers.Observer;

public interface Subject {

    void registerObserver(Observer o);

    void unregisterObeserver(Observer o);

    void notifyObserver();
}
