package pattern.structural.adapter;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/17
 */
public class Mi20 {

    private MicroUsbInterface microUsbInterface;

    public Mi20() {
    }

    public Mi20(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }

    public void charge(){
        System.out.println("开始给我的Mi20手机充电...");
        microUsbInterface.chargeWithMicroUsb();
        System.out.println("结束给我的Mi20手机充电...");
    }

    public MicroUsbInterface getMicroUsbInterface() {
        return microUsbInterface;
    }

    public void setMicroUsbInterface(MicroUsbInterface microUsbInterface) {
        this.microUsbInterface = microUsbInterface;
    }
}
