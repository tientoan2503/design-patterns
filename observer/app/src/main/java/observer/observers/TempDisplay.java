package observer.observers;

import observer.subjects.Subject;

public class TempDisplay implements Display, Observer {
    private int temp;
    private Subject subject;

    public TempDisplay(Subject s) {
        s.registerObserver(this);
        subject = s;
    }

    @Override
    public void update(int temp, int hum) {
        this.temp = temp;
        display();
    }

    @Override
    public void display() {
        System.out.println("Today, temperature is " + temp + "C");
    }

}
