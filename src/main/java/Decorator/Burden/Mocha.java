/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-08 20:43
 **/
package Decorator.Burden;

import Decorator.compontent.Beverage;
import Decorator.compontent.ConDimentDecorator;

public class Mocha extends ConDimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return  beverage.getDescprition()+", Mocha";
    }

    @Override
    public Double cost() {
        return beverage.cost()+0.20;
    }
}