package pattern.behavioral.command;

/**
 * TODO
 *
 * @author blackey
 * @date 2019/4/20
 */
public class UndoCommand extends Command {

    protected Phone phone;

    UndoCommand(Phone phone){
        this.phone = phone;
    }

    @Override
    void execute() {

        phone.excuteUnDo();
    }
}
