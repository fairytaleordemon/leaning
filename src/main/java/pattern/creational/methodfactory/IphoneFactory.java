package pattern.creational.methodfactory;

/**
 * iphone 手机制造商
 *
 * @author blackey
 * @date 2019/4/15
 */
public class IphoneFactory extends AbstractFactory {

    @Override
    public AbstractPhone makePhone() {
        System.out.println("iphone 制造中 \n ....\n制造完成");
        return new IPhone();
    }
}
