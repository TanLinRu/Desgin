/**
 * @program: desgin
 * @description: 同步方法
 * @author: TLQ
 * @create: 2019-05-25 22:04
 **/
package Singleton;

public class Singleton3 {
    private Singleton3(){}
    private static Singleton3 singleton3;
    public synchronized Singleton3 getInstance(){
        if (singleton3 == null) {
            singleton3 = new Singleton3();
        }
        return singleton3;
    }

}