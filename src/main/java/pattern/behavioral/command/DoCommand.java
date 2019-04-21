package pattern.behavioral.command;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/20
 */
public class DoCommand extends Command{

    protected Phone phone;

    DoCommand(Phone phone){
        this.phone = phone;
    }


    @Override
    void execute() {
        phone.excuteDo();
    }
}
