/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-08 20:34
 **/
package Decorator.compontent;

public abstract class ConDimentDecorator  extends Beverage{
    protected Beverage beverage;
    public ConDimentDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    public abstract String getDescription();
}