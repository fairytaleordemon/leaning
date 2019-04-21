package pattern.behavioral.observer;

/**
 *
 * @author blackey
 * @date 2019/4/21
 */
public abstract class Observer {

    Subject subject;

    abstract void update();
}
