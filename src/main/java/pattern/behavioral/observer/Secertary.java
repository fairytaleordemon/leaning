package pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author blackey
 * @date 2019/4/21
 */
public class Secertary extends Subject {

    private List<Observer> observers = new ArrayList<>();

    @Override
    void attach(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    void deAttach(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyAllSubject(){
        for (Observer ob : observers) {
            ob.update();
        }
    }
}
