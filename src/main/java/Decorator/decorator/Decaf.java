/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-08 20:54
 **/
package Decorator.decorator;

import Decorator.compontent.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        super("Decaf");
    }

    @Override
    public Double cost() {
        return 1.05;
    }
}