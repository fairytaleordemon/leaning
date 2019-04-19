package pattern.creational.methodfactory;

/**
 * mi20 制造商
 *
 * @author blackey
 * @date 2019/4/15
 */
public class Mi20Factory extends AbstractFactory {

    @Override
    public AbstractPhone makePhone() {
        System.out.println("mi20 制造中 \n ....\n制造完成");
        return new Mi20();
    }
}
