package pattern.structural.adapter;

/**
 * 安卓设备的充电器
 */
public class AndroidCharger implements MicroUsbInterface {

    @Override
    public void chargeWithMicroUsb() {
        System.out.println("使用MicroUsb型号的充电器充电...");
    }
}
