/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-06-12 09:43
 **/
package Iterator;

import sun.security.tools.keytool.CertAndKeyGen;

import java.nio.channels.NonWritableChannelException;

public class TestApp {

    public static void main(String[] args) {
        MenuComponent breakFastMenu = new Menu("BreakFast Menu","BreakFast") ;
        MenuComponent dinerMenu = new Menu("Dinner Menu","Dinner") ;
        MenuComponent cafeMenu = new Menu("Cafe Menu","Cafe") ;
        MenuComponent dessertMenu = new Menu("Dessert Menu","Dessert") ;

        MenuComponent allMenus = new Menu("All Menu","All Menus");
        allMenus.add(breakFastMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        breakFastMenu.add(new MenuItem("Egg Cake","scrambled eggs and toast",true,2.99));
        breakFastMenu.add(new MenuItem("Hamburger Patty","scrambled eggs and toast",true,2.99));
        breakFastMenu.add(new MenuItem("Pancakes","scrambled eggs and toast",true,2.99));
        dinerMenu.add(new MenuItem("Vegetarian","tomato",true,2.99));
        dinerMenu.add(new MenuItem("Tomato","tomato",true,2.99));
        dinerMenu.add(new MenuItem("HotDog","tomato",true,2.99));
        cafeMenu.add(new MenuItem("Burger","fires",true,1.99));
        cafeMenu.add(new MenuItem("Burger","fires",true,4.25));

        NewMenu newMenu = new NewMenu(allMenus);
        newMenu.printMenu();
    }

}