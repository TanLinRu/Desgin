/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-25 20:48
 **/
package Common;

import java.util.ArrayList;
import java.util.Collection;

public class MenuCommand implements Command {
    private Collection<Command> col = new ArrayList<Command>();

    public void addCommand(Command cmd) {
        col.add(cmd);
    }

    public void execute() {
        CommandQueue.addMenu(this);
    }

    public void setCookApi(CookApi cookApi) {

    }

    public int getTableName() {
        return 0;
    }

    public Collection<Command> getCommands() {
        return this.col;
    }
}