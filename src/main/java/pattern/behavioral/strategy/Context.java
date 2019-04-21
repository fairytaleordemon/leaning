package pattern.behavioral.strategy;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/21
 */
public class Context {

    private Strategy strategy;

    Context(String type){
        switch (type){
            case "1":
                strategy = new Discount();
                return;
            case "2":
                strategy = new PayCash();
                return;
            case "3":
                strategy = new CashReturn();
                return;
            default:
                break;
        }
    }

    int getResult(int money){
        return  strategy.payMoney(money);
    }
}
