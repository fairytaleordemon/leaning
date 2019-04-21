package pattern.behavioral.strategy;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/21
 */
public class Client {


    public static void main(String[] args) {
        Context context = new Context("1");
        context.getResult(200);

        Context context1 = new Context("2");
        context1.getResult(200);

        Context context2 = new Context("3");
        context2.getResult(200);
    }
}
