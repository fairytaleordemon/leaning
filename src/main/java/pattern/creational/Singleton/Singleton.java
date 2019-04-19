package pattern.creational.Singleton;

/**
 * 饿汉式单例模式
 *
 * @author blackey
 * @date 2019/4/15
 */
public class Singleton {

    /**
     * 在类内部实例化一个实例
     */
    private static Singleton instance = new Singleton();

    /**
     * 私有的构造函数,外部无法访问
     */
    private Singleton() {
    }

    /**
     * 对外提供获取实例的静态方法
     * @return
     */
    public static Singleton getInstance() {
        return instance;
    }
}
