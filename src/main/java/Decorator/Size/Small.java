/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-08 21:15
 **/
package Decorator.Size;

import Decorator.compontent.Beverage;
import Decorator.compontent.SizeDecortor;

public class Small extends SizeDecortor {

    public Small(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescprition()+", Small";
    }

    @Override
    public Double cost() {
        return beverage.cost()+0.10;
    }
}