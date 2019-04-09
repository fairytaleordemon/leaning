package thread;

import java.util.concurrent.FutureTask;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/2/27
 */
public class ThreadTest {

    public static int a =  1;

    void test1(){
        Thread thread = new MyThread();
        Thread thread1 = new Thread(new MyRunnable());
        FutureTask futureTask = new FutureTask(new MyCallable<>());
        Thread thread2 = new Thread(futureTask);

//        thread.run();
//        thread1.run();
//        thread2.run();

        thread.start();
        thread1.start();
        thread2.start();
    }


    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        System.out.println(a);
        threadTest.test1();
    }
}
