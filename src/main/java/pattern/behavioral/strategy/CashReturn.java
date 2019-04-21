package pattern.behavioral.strategy;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/21
 */
public class CashReturn extends Strategy {

    @Override
    int payMoney(int money) {
        System.out.println("返现200");
        return money - 200;
    }
}
