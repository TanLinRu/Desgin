/**
 * @program: desgin
 * @description: 饿汉式
 * @author: TLQ
 * @create: 2019-05-25 22:00
 **/
package Singleton;

public class Singleton1 {
    private static Singleton1 singleton1 = new Singleton1();
    private Singleton1(){}
    public static Singleton1 getInstance(){
        return singleton1;
    }
}