/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-25 21:29
 **/
package Common.Fan;

public class CellingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    int speed;

    public CellingFan() {
        speed = OFF;
    }

    public void high() {
        speed = HIGH;
        System.out.println("风扇速度：高");
    }

    public void medium() {
        speed = MEDIUM;
        System.out.println("风扇速度：中");
    }

    public void low() {
        speed = LOW;
        System.out.println("风扇速度：低");
    }

    public void off() {
        speed = OFF;
        System.out.println("风扇速度：停");
    }

    public int getSpeed() {
        return this.speed;
    }
}