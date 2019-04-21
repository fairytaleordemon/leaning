package pattern.behavioral.mediator;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/20
 */
public class XiaoMing extends Colleague {

    XiaoMing(){
        this.setName("小明");
    }

    @Override
    void coding() {
        this.setCode("小明刚写的代码");
    }
}
