package pattern.creational.factory;

/**
 * 简单工厂设计模式
 *
 *
 * @author blackey
 * @date 2019/4/10
 */
public class Factory {

    /**
     * 制造手机
     * @param price 价格
     * @return
     */
    public Phone makePhone(int price){
        if (price > 3000 ){
            return new Iphone();
        }else {
            return  new Mi20();
        }
    }

    public static void main(String[] args) {
        new Factory().makePhone(2000).playWangZhe();
    }

}
