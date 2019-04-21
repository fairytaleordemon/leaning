package pattern.behavioral.mediator;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/20
 */
public class Xiaowang extends Colleague {

    Xiaowang(){
        this.setName("小王");
    }



    @Override
    void coding() {
        this.setCode("小王刚写的代码");
    }
}
