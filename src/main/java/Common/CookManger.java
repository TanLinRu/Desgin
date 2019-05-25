/**
 * @program: desgin
 * @description: 后厨管理类
 * @author: TLQ
 * @create: 2019-05-25 21:11
 **/
package Common;

import com.sun.org.apache.bcel.internal.generic.NEW;
import sun.applet.Main;

public class CookManger {
    private static  boolean runFlag = false;

    public static void runCookManager() {
        if (!runFlag) {
          runFlag = true;
          HotCook cook1 = new HotCook("张三");
          HotCook cook2 = new HotCook("李四");
          HotCook cook3 = new HotCook("王五");

          Thread thread =  new Thread(cook1);
          thread.start();
          Thread thread1 = new Thread(cook2);
          thread1.start();
          Thread thread2 = new Thread(cook3);
          thread2.start();
        }
    }
}