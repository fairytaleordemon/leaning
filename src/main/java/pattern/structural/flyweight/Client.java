package pattern.structural.flyweight;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/19
 */
public class Client {

    public static void main(String[] args) {
        PhotoFactory photoFactory = new PhotoFactory();
        photoFactory.takePhoto("上海");
        photoFactory.takePhoto("南京");
        photoFactory.takePhoto("北京");
        photoFactory.takePhoto("四川");

        photoFactory.getPhoto("上海").info();

    }
}
