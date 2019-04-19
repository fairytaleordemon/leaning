package pattern.creational.Singleton;

/**
 * 懒汉式
 *
 * @author blackey
 * @date 2019/4/15
 */
public class Singleton3 {

    /**
     *
     定义实例
     */
    private static Singleton3 instance;

    /**
     * 私有构造方法
     */
    private Singleton3() {
    }

    /**
     * 对外提供获取实例的静态方法
     */
    public static Singleton3 getInstance() {
        //在对象被使用的时候才实例化
        if (instance ==
                null) {
            instance = new Singleton3();
        }
        return instance;
    }
}
