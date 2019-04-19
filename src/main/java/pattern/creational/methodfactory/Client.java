package pattern.creational.methodfactory;

/**
 * 客户端
 *
 * @author blackey
 * @date 2019/4/15
 */
public class Client {


    public static AbstractPhone buy(int price){
        if (price > 3000){
            return new IphoneFactory().makePhone();
        }else {
            return new Mi20Factory().makePhone();
        }
    }

    public static void main(String[] args) {
        Client.buy(2000).playWangzhe();
    }
}
