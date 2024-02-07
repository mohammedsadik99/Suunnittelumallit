import java.util.Timer;
import java.util.TimerTask;

public class ObserverMain {
    public static void main(String[] args) {
        ClockTimer timer = new ClockTimer();
        DigitalClock clock = new DigitalClock(timer);

        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                timer.tick();
            }
        }, 0, 1000);
    }
}