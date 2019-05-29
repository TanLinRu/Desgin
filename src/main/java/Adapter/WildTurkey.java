/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-29 09:14
 **/
package Adapter;

public class WildTurkey implements Turkey {

    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm fily a short distance");
    }
}