package pattern.structural.bridge;

/**
 *
 * @author blackey
 * @date 2019/4/17
 */
public class Mi20 extends Brand{

    @Override
    void run() {
        System.out.println("----mi20 的程序 -----");
        for (SoftWare so : softWare) {
            so.run();
        }
    }
}
