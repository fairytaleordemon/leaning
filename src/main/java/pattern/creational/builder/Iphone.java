package pattern.creational.builder;

/**
 * 实际产品对象，比如Iphone 手机
 *
 * @author blackey
 * @date 2019/4/15
 */
public class Iphone {

    private String screen;

    private String camera;

    private String battery;

    private String storage;


    public void setScreen(String screen) {
        this.screen = screen;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    /**
     * 关于手机
     */
    public void info(){

        System.out.println("\n--------关于手机--------");
        System.out.println("手机屏幕大小 ：" + screen);
        System.out.println("手机摄像头像素 ：" + camera);
        System.out.println("手机电池容量 ：" + battery);
        System.out.println("手机内存大小 ：" + storage);
    }
}
