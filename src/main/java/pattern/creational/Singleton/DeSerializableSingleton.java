package pattern.creational.Singleton;

import java.io.Serializable;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/15
 */
public class DeSerializableSingleton implements Serializable {

    private volatile static DeSerializableSingleton singleton;

    private DeSerializableSingleton() {
    }

    public static DeSerializableSingleton getSingleton() {
        if (singleton ==
                null) {
            synchronized (DeSerializableSingleton.class) {
                if (singleton ==
                        null) {
                    singleton = new DeSerializableSingleton();
                }
            }
        }
        return singleton;
    }

    private Object readResolve() {
        return singleton;
    }
}
