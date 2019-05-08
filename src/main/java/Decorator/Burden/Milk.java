/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-08 21:01
 **/
package Decorator.Burden;

import Decorator.compontent.Beverage;
import Decorator.compontent.ConDimentDecorator;

public class Milk extends ConDimentDecorator {

    public Milk(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescprition()+", Milk";
    }

    @Override
    public Double cost() {
        return beverage.cost()+0.10;
    }
}