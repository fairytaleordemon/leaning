package pattern.behavioral.mediator;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/21
 */
public class Client {

    public static void main(String[] args) {
        Github github = new Github();

        XiaoMing xiaoMing = new XiaoMing();
        Xiaowang xiaowang = new Xiaowang();

        github.setXiaoMing(xiaoMing);
        github.setXiaowang(xiaowang);

        xiaoMing.coding();
        xiaowang.coding();


        github.commitCode(xiaoMing);
        github.reviewCode(xiaoMing);
    }
}
