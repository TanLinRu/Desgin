/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-29 09:17
 **/
package Adapter;

public class TurkeyAdapter implements Bird {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        turkey.fly();
    }
}