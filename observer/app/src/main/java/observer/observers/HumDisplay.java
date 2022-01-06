package observer.observers;

import observer.subjects.Subject;

public class HumDisplay implements Display, Observer {

    private Subject subject;
    private int hum;

    public HumDisplay(Subject s) {
        s.registerObserver(this);
        subject = s;
    }

    @Override
    public void display() {
        System.out.println("Today, humidity is " + hum + "%");
    }

    @Override
    public void update(int temp, int hum) {
        this.hum = hum;
        display();
    }

}
