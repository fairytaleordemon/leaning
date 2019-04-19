package pattern.creational.abstractfactory;

/**
 *
 * @author blackey
 * @date 2019/4/15
 */
public class Client {

    public static AbstractPhoneProduct buyPhone(int price){
        if (price > 3000){
            return new Iphone();
        }else {
            return new Mi20();
        }
    }

    public static AbstractPadProduct buyPad(int price){
        if (price > 3000){
            return new MiPad();
        }else {
            return new Ipad();
        }
    }

    public static void main(String[] args) {
        Client.buyPhone(4000).playWangzhe();
        Client.buyPhone(2000).playWangzhe();
        Client.buyPad(4000).watchMovie();
        Client.buyPad(2000).watchMovie();
    }
}
