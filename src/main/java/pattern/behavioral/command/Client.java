package pattern.behavioral.command;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/20
 */
public class Client {

    public static void main(String[] args) {
        Phone phone = new Phone();

        DoCommand doCommand = new DoCommand(phone);
        UndoCommand undoCommand = new UndoCommand(phone);

        User user = new User();
        user.setCommand(doCommand);
        user.execute();
        user.setCommand(undoCommand);
        user.execute();

    }
}
