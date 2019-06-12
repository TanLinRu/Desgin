/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-06-12 09:42
 **/
package Iterator;

public class NewMenu {

    MenuComponent newMenu;

    public NewMenu(MenuComponent newMenu) {
        this.newMenu = newMenu;
    }

    public void printMenu() {
        newMenu.print();
    }
}