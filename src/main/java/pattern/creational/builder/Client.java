package pattern.creational.builder;

/**
 * 购买手机的人
 *
 * @author blackey
 * @date 2019/4/15
 */
public class Client {


    public static void buy(){
        //小明来买手机，认识一个导购，导购给他介绍了一个人帮他造一个手机
        Director director = new Director();
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        director.setBuilder(concreteBuilder);

        director.construct();
        Iphone iphone = concreteBuilder.getResult();
        //查看手机信息
        iphone.info();
    }

    public static void main(String[] args) {
        Client.buy();
    }

}
