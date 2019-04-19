package pattern.structural.adapter;

/**
 * 苹果设备的充电器
 */
public class AppleCharger implements LightningInterface {
    @Override
    public void chargeWithLightning() {
        System.out.println("使用Lightning型号的充电器充电...");
    }
}