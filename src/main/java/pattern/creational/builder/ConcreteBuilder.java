package pattern.creational.builder;

/**
 * 实际的建造者，可以理解成为工厂中的一个流水线员工
 *
 * @author blackey
 * @date 2019/4/15
 */
public class ConcreteBuilder extends Builder{

    private Iphone iphone = new Iphone();

    @Override
    public void buildScreen() {
        this.iphone.setScreen("5.5寸超大屏！");
        System.out.println("屏幕组装中\n...\n组装完成");
    }

    @Override
    public void buildBattery() {
        this.iphone.setBattery("3000毫安");
        System.out.println("电池组装中\n...\n组装完成");

    }

    @Override
    public void buildCamera() {
        this.iphone.setCamera("前后置2000w");
        System.out.println("摄像头组装中\n...\n组装完成");

    }

    @Override
    public void buildStorage() {
        this.iphone.setStorage("256G");
        System.out.println("内存组装中\n...\n组装完成");

    }

    @Override
    public Iphone getResult() {
        return this.iphone;
    }
}
