package thread;

/**
 * @author blackey
 * @date 2019/2/27
 */
public class MyRunnable implements Runnable {


    ThreadTest threadTest = new ThreadTest();

    @Override
    public void run() {
        for (int i = 0; i <
                20; i++) {
            System.out.println("My Runnable is running before!"+ThreadTest.a);
            ThreadTest.a = 200;
            System.out.println("My Runnable is running after !"+ThreadTest.a);
        }
    }
}
