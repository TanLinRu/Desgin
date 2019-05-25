/**
 * @program: desgin
 * @description: 双重加锁
 * @author: TLQ
 * @create: 2019-05-25 22:01
 **/
package Singleton;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class Singltton2 {
    private volatile static Singltton2 singltton2;
    private Singltton2(){}
    public static Singltton2 getInstance() {
        if (singltton2 == null) {
            synchronized (Singltton2.class) {
                singltton2 = new Singltton2();
            }
        }
        return singltton2;
    }
}