/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-29 09:13
 **/
package Adapter;

public class MallmardBird implements Bird {

    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}