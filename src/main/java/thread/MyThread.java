package thread;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/2/27
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i <
                20; i++) {
            System.out.println("MyThread is running before!" + ThreadTest.a);
            ThreadTest.a = 100;
            System.out.println("MyThread is running after!" + ThreadTest.a);
        }
    }
}
