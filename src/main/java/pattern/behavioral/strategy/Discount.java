package pattern.behavioral.strategy;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/21
 */
public class Discount extends Strategy {

    @Override
    int payMoney(int money) {
        System.out.println("打8折");
        return (int) (money * 0.8);
    }
}
