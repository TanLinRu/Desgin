/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-08 21:16
 **/
package Decorator.Size;

import Decorator.compontent.Beverage;
import Decorator.compontent.SizeDecortor;

public class medium extends SizeDecortor {

    public medium(Beverage beverage) {
        super(beverage);
    }

    public String getDescription() {
        return beverage.getDescprition()+", Medium";
    }

    @Override
    public Double cost() {
        return beverage.cost()+0.15;
    }
}