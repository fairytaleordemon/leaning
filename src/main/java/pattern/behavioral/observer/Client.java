package pattern.behavioral.observer;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/21
 */
public class Client {

    public static void main(String[] args) {
        Secertary secertary = new Secertary();


        StockObserver stockObserver = new StockObserver(secertary);
        NBAObserver nbaObserver = new NBAObserver(secertary);

        secertary.setName("前台秘书");

        secertary.attach(stockObserver);
        secertary.attach(nbaObserver);

        secertary.notifyAllSubject();

    }

}
