/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-08 10:06
 **/
package Decorator.decorator;

import Decorator.compontent.Beverage;

public class HousBlend extends Beverage {

    public HousBlend() {
        super("HousBlend");
    }

    @Override
    public Double cost() {
        return 0.89;
    }
}