import java.util.Observable;
import java.util.Observer;

class ClockTimer extends Observable {
    private int hour, minute, second;

    public void tick() {
        second++;
        if (second >= 60) {
            second = 0;
            minute++;
        }
        if (minute >= 60) {
            minute = 0;
            hour++;
        }
        if (hour >= 24) {
            hour = 0;
        }

        setChanged();
        notifyObservers();
    }

    // Getter methods
    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }
}

// Observer class for displaying time
class DigitalClock implements Observer {
    private ClockTimer timer;

    public DigitalClock(ClockTimer timer) {
        this.timer = timer;
        timer.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o == timer) {
            System.out.println("Time updated: " + timer.getHour() + ":" + timer.getMinute() + ":" + timer.getSecond());
        }
    }
}