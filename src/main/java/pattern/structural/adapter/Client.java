package pattern.structural.adapter;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/17
 */
public class Client {

    public static void main(String[] args) {
        Iphone6Plus iphone6Plus = new Iphone6Plus(new AppleCharger());
        iphone6Plus.charge();

        System.out.println("==============================");

        Mi20 mi20 = new Mi20(new AndroidCharger());
        mi20.charge();

        System.out.println("==============================");

        Adapter adapter  = new Adapter(new AndroidCharger());
        Iphone6Plus newIphone = new Iphone6Plus();
        newIphone.setLightningInterface(adapter);
        newIphone.charge();
    }
}
