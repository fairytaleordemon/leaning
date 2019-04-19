package pattern.creational.Singleton;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/15
 */
public class FinalSingleton {

    private FinalWrapper<FinalSingleton> helperWrapper = null;

    public FinalSingleton getHelper() {
        FinalWrapper<FinalSingleton> wrapper = helperWrapper;

        if (wrapper == null) {
            synchronized (this) {
                if (helperWrapper == null) {
                    helperWrapper = new FinalWrapper<FinalSingleton>(new FinalSingleton());
                }
                wrapper = helperWrapper;
            }
        }
        return wrapper.value;
    }

    class FinalWrapper<T> {
        public final T value;

        public FinalWrapper(T value) {
            this.value = value;
        }
    }
}
