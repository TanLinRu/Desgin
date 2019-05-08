/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-08 21:17
 **/
package Decorator.Size;

import Decorator.compontent.Beverage;
import Decorator.compontent.SizeDecortor;

public class Big extends SizeDecortor {

    public Big(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescprition()+", Big";
    }

    @Override
    public Double cost() {
        return beverage.cost()+0.20;
    }
}