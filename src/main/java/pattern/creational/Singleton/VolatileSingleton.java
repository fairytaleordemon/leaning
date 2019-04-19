package pattern.creational.Singleton;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/15
 */
public class VolatileSingleton {

    private static volatile VolatileSingleton singleton;

    private VolatileSingleton() {
    }

    public static VolatileSingleton getSingleton() {
        if (singleton == null) {
            synchronized (VolatileSingleton.class) {
                if (singleton == null) {
                    singleton = new VolatileSingleton();
                }
            }
        }
        return singleton;
    }
}
