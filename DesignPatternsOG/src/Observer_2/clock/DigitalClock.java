package Observer_2.clock;

import Observer_2.observer.Observer;
import Observer_2.observer.Subject;

public class DigitalClock implements Observer {
    private int hour;
    private int minute;
    private int second;

    public DigitalClock(Subject clockTimer) {
        clockTimer.registerObserver(this);
    }

    public void update(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        display();
    }

    private void display() {
        System.out.println("DIGITAL CLOCK: Hour : " + hour + " / Min : " + minute + " / Sec : " + second);
    }
}