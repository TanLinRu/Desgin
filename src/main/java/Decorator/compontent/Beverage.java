/**
 * @program: desgin
 * @description: Beverage抽象组件
 * @author: TLQ
 * @create: 2019-05-08 09:23
 **/
package Decorator.compontent;

public abstract class Beverage {
    private String descprition = "Unkonwn Beverage";

    public Beverage(){

    }

    public Beverage(String desp){
        this.descprition = desp;
    }

    public String getDescprition(){
        return  descprition;
    }

    public Double cost(){
        return 0.00;
    }


}