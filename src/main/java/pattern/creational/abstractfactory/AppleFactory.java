package pattern.creational.abstractfactory;

/**
 * 苹果厂商
 *
 * @author blackey
 * @date 2019/4/15
 */
public class AppleFactory extends AbstractFactory{

    @Override
    public AbstractPhoneProduct makePhone() {
        System.out.println("iphone 制造中 \n ....\n制造完成");
        return new Iphone();
    }

    @Override
    public AbstractPadProduct makePad() {
        System.out.println("ipad 制造中 \n ....\n制造完成");
        return new Ipad();
    }
}
