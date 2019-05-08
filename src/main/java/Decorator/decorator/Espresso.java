/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-08 20:25
 **/
package Decorator.decorator;

import Decorator.compontent.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        super("Espresso");
    }

    @Override
    public Double cost() {
        return 1.99;
    }
}