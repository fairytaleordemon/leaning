package pattern.behavioral.state;

/**
 *
 *
 * @author blackey
 * @date 2019/4/21
 */
public class AWork extends State {

    @Override
    void handle(Work work) {
        if (work.hour < 12){
            System.out.println("已经上班12个小时了，瞌睡！");
        }else {
            work.changeStatue(new BWork());
            work.handle();
        }
    }
}
