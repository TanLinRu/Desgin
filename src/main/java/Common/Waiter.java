/**
 * @program: desgin
 * @description: 服务员
 * @author: TLQ
 * @create: 2019-05-25 21:09
 **/
package Common;

public class Waiter {
    private MenuCommand menuCommand = new MenuCommand();

    public void orderDish(Command command) {
        menuCommand.addCommand(command);
    }
    public void orderOver() {
        this.menuCommand.execute();
    }
}