package pattern.behavioral.observer;

/**
 *
 * @author blackey
 * @date 2019/4/21
 */
public  abstract class Subject {

    private String name;

    abstract void attach(Observer observer);

    abstract void deAttach(Observer observer);


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void notifyAllSubject();
}
