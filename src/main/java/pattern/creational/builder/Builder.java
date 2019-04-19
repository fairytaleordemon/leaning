package pattern.creational.builder;

/**
 * 制造对象，可以理解为一个制作流程。这里我们以iphone手机的制作为例
 *
 * @author blackey
 * @date 2019/4/15
 */
public abstract class Builder {

    /**
     * 生产屏幕
     */
    public abstract void buildScreen();

    /**
     * 生产电池
     */
    public abstract void buildBattery();

    /**
     * 生产照相机
     */
    public abstract void buildCamera();

    /**
     * 生产内存
     */
    public abstract void buildStorage();

    public abstract Iphone getResult();

}
