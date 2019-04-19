package pattern.creational.abstractfactory;

/**
 *
 * @author blackey
 * @date 2019/4/15
 */
public class MiFactory extends AbstractFactory {
    @Override
    public AbstractPhoneProduct makePhone() {
        System.out.println("mi20 制造中 \n ....\n制造完成");
        return new Mi20();
    }

    @Override
    public AbstractPadProduct makePad() {
        System.out.println("mipad 制造中 \n ....\n制造完成");
        return new MiPad();
    }
}
