package pattern.creational.Singleton;

/**
 * 静态内部类单例模式
 * 与静态方法实现略有差异，静态方法在加载对象时，便会创建对象。
 * 但静态内部类这种只有在调用getInstance方法时才会被加载
 *
 * @author blackey
 * @date 2019/4/15
 */
public class StaticInnerClassSingleton {


    //在静态内部类中初始化实例对象
    private static class SingletonHolder {
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }
    //私有的构造方法
    private StaticInnerClassSingleton() {
    }
    //对外提供获取实例的静态方法
    public static final StaticInnerClassSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
