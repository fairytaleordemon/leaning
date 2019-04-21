package pattern.behavioral.strategy;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/21
 */
public class PayCash extends Strategy {


    @Override
    int payMoney(int money) {
        System.out.println("正常支付");
        return money;
    }
}
