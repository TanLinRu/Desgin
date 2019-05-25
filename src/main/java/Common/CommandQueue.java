/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-25 20:57
 **/
package Common;

import java.util.ArrayList;
import java.util.List;

public class CommandQueue {
    private static List<Command> cmds = new ArrayList<Command>();

    public synchronized  static void addMenu(MenuCommand menuCommand) {
        for (Command cmd: menuCommand.getCommands()) {
            cmds.add(cmd);
        }
    }

    public synchronized static Command getOneComand() {
        Command command = null;
        if (cmds.size() > 0 ){
            command = cmds.get(0);
            cmds.remove(0);
        }
        return command;
    }
}