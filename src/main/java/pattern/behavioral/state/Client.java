package pattern.behavioral.state;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/21
 */
public class Client {

    public static void main(String[] args) {
        Work work = new Work();

        work.hour = 10;
        work.handle();
        work.hour = 13;
        work.handle();

    }
}
