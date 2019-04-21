package pattern.behavioral.mediator;

/**
 * 中介者
 *
 * @author blackey
 * @date 2019/4/20
 */
public abstract class Mediator {

    abstract void commitCode(Colleague colleague);

    abstract void reviewCode(Colleague colleague);
}
