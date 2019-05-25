/**
 * @program: desgin
 * @description: 懒汉式
 * @author: TLQ
 * @create: 2019-05-25 21:57
 **/
package Singleton;

public class Singleton {
    private static Singleton singleton;
    private Singleton(){}
    public static synchronized Singleton getInstance(){
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}