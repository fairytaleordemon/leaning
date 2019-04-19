package pattern.creational.Singleton;

/**
 * 双重校验锁
 *
 * @author blackey
 * @date 2019/4/15
 */
public class DoubleLockSingleton{

    private static DoubleLockSingleton doubleLockSingleton;

    private DoubleLockSingleton() {
    }

    public static DoubleLockSingleton getSingleton() {
        if (doubleLockSingleton == null) {
            synchronized (Singleton.class) {
                if (doubleLockSingleton == null) {
                    doubleLockSingleton = new DoubleLockSingleton();
                }
            }
        }
        return doubleLockSingleton;
    }
}
