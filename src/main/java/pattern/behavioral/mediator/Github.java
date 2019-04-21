package pattern.behavioral.mediator;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/21
 */
public class Github extends Mediator {


    public XiaoMing xiaoMing;

    public Xiaowang xiaowang;


    public void setXiaoMing(XiaoMing xiaoMing) {
        this.xiaoMing = xiaoMing;
    }

    public void setXiaowang(Xiaowang xiaowang) {
        this.xiaowang = xiaowang;
    }

    @Override
    void commitCode(Colleague colleague) {
        System.out.println(colleague.getName() + "提交了代码：" + colleague.getCode());

    }

    @Override
    void reviewCode(Colleague colleague) {
        System.out.println(colleague.getName() + "审核了代码 "  + colleague.getCode());

    }
}
