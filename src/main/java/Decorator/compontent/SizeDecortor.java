/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-08 21:02
 **/
package Decorator.compontent;

public abstract class SizeDecortor extends Beverage {
    protected Beverage beverage;
    public SizeDecortor(Beverage beverage){
        this.beverage = beverage;
    }

    public abstract String getDescription();
}