package pattern.structural.bridge;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/17
 */
public class Client {


    public static void main(String[] args) {
        Mi20 mi20 = new Mi20();
        mi20.installSoft(new QQSoft());
        mi20.installSoft(new WangZheSoft());
        mi20.run();

    }
}
