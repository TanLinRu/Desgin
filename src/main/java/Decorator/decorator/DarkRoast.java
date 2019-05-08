/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-08 21:00
 **/
package Decorator.decorator;

import Decorator.compontent.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        super("DarkRoast");
    }

    @Override
    public Double cost() {
        return 0.99;
    }
}