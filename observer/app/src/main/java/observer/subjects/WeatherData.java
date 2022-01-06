package observer.subjects;

import java.util.ArrayList;
import observer.observers.Observer;

public class WeatherData implements Subject {
    private ArrayList<Observer> mObserverList;
    private int temp;
    private int hum;

    public WeatherData() {
        mObserverList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        if (!mObserverList.contains(o)) {
            mObserverList.add(o);
        }
    }

    @Override
    public void unregisterObeserver(Observer o) {
        if (mObserverList.contains(o)) {
            mObserverList.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (Observer o : mObserverList) {
            o.update(temp, hum);
        }
    }

    public void setData(int temp, int hum) {
        this.temp = temp;
        this.hum = hum;
        notifyObserver();
    }
}
