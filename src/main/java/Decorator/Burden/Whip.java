/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-08 20:36
 **/
package Decorator.Burden;

import Decorator.compontent.Beverage;
import Decorator.compontent.ConDimentDecorator;

public class Whip extends ConDimentDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescprition()+",Whip";
    }

    @Override
    public Double cost() {
        return beverage.cost()+0.10;
    }
}