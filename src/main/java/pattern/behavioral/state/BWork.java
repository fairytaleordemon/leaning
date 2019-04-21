package pattern.behavioral.state;

/**
 *
 * @author blackey
 * @date 2019/4/21
 */
public class BWork extends State{

    @Override
    void handle(Work work) {
        System.out.println("下班睡觉。");
    }
}
