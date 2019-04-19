package pattern.structural.proxy;

/**
 *
 * @author blackey
 * @date 2019/4/19
 */
public class ProxyIphone extends Buy{

    Iphone iphone = new Iphone();

    @Override
    public void buyIphone(){
        beforeBuyIphone();
        iphone.buyIphone();
        afterBuyIphone();
    }

    public void beforeBuyIphone(){
        System.out.println("准备现金、排队");
    }

    public void afterBuyIphone(){
        System.out.println("邮寄给小明");
    }

}
