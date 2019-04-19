package pattern.creational.builder;

/**
 * 指挥者，这里可以认为是iphone手机制造商的负责人
 *
 *
 * @author blackey
 * @date 2019/4/15
 */
public class Director {

    private Builder builder;

    /**
     * 制作手机
     */
    void construct(){
        builder.buildBattery();
        builder.buildCamera();
        builder.buildScreen();
        builder.buildStorage();
    }

    /**
     * 指派操作员
     * @param builder
     */
    public void setBuilder(Builder builder){
        this.builder = builder;
    }
}

