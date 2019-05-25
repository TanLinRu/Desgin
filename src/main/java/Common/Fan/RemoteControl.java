/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-25 21:47
 **/
package Common.Fan;

public class RemoteControl {


    Command command;
    public RemoteControl() {
        Command noCommand = new NoCommand();
        command = noCommand;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPushed() {
        command.excute();
    }

    public void undoButtonWasPushed() {
        command.undo();
    }
}