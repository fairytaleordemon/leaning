package pattern.structural.decorator;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/17
 */
public class Client {


    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setName("小明");

        Membrane membrane = new Membrane();
        Shell shell = new Shell();

        membrane.decorate(phone);
        shell.decorate(phone);
        phone.show();

    }
}
