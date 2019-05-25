/**
 * @program: desgin
 * @description: 客户
 * @author: TLQ
 * @create: 2019-05-25 21:16
 **/
package Common;

public class Client {
    public static void  main(String[] aargs) {
        CookManger.runCookManager();
        for (int i =0 ;i < 5 ; i++) {
            Waiter waiter = new Waiter();
            Command chop = new ChopCommand(i);
            Command duck = new DuckCommand(i);
            waiter.orderDish(chop);
            waiter.orderDish(duck);
            waiter.orderOver();
        }
    }
}