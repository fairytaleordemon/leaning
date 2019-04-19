package pattern.structural.proxy;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/19
 */
public class Client {


    public static void main(String[] args) {
        ProxyIphone proxyIphone = new ProxyIphone();
        proxyIphone.buyIphone();
    }
}
