package pattern.structural.facade;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/19
 */
public class VmPhone {

    IPhone iphone = new IPhone();
    Android android  = new Android();

    public void runAndroid(){
        android.run();
    }

    public void runIphone(){
        iphone.run();
    }

}
