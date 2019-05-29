/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-29 09:19
 **/
package Adapter;

public class BirdAdapter implements Turkey {

    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    public void gobble() {
        bird.quack();
    }

    public void fly() {
        bird.fly();
    }
}