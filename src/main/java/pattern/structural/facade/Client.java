package pattern.structural.facade;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/19
 */
public class Client {

    public static void main(String[] args) {
        VmPhone vmPhone = new VmPhone();
        vmPhone.runAndroid();
        vmPhone.runIphone();
    }
}
