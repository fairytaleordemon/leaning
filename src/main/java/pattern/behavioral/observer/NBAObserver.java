package pattern.behavioral.observer;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/21
 */
public class NBAObserver extends Observer{


    NBAObserver(Subject subject){
        this.subject = subject;
    }

    @Override
    void update() {
        System.out.println(subject.getName() + "看篮球的同事关闭网页，开始认真工作。");
    }
}
