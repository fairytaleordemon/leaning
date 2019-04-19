package pattern.creational.Singleton;

/**
 * 线程安全的懒汉式
 *
 * @author blackey
 * @date 2019/4/15
 */
public class SynchronizedSingleton {


    private static SynchronizedSingleton instance;

    private SynchronizedSingleton() {
    }

    //对外提供获取实例的静态方法,对该方法加锁
    public static synchronized SynchronizedSingleton getInstance() {
        //在对象被使用的时候才实例化
        if (instance ==
                null) {
            instance = new SynchronizedSingleton();
        }
        return instance;
    }
}
