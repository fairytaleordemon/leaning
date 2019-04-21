package pattern.behavioral.observer;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/21
 */
public class StockObserver extends Observer {

    StockObserver(Subject subject){
        this.subject = subject;
    }

    @Override
    void update() {
        System.out.println(subject.getName() + "通知看股票的同事关闭股票，开始认真工作。");
    }
}
