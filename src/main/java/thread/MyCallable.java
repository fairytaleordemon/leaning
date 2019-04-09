package thread;

import java.util.concurrent.Callable;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/2/27
 */
public class MyCallable<T> implements Callable<T> {

    @Override
    public T call() throws Exception {
        for (int i = 0; i <
                20; i++) {

            System.out.println("MyCallable is running before!" + ThreadTest.a);
            ThreadTest.a=300;
            System.out.println("MyCallable is running after!" + ThreadTest.a);
        }
        return (T) "feature";
    }
}
