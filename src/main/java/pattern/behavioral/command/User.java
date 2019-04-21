package pattern.behavioral.command;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/20
 */
public class User {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void execute(){
        this.command.execute();
    }
}
