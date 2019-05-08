/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-08 20:40
 **/
package Decorator.Burden;

import Decorator.compontent.Beverage;
import Decorator.compontent.ConDimentDecorator;

public class Soy extends ConDimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescprition()+", Soy";
    }

    @Override
    public Double cost() {
        return beverage.cost()+0.15;
    }
}