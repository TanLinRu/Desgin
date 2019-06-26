/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-06-26 09:16
 **/
package Strategy;

public class Price {

    Strategy strategy;

    public Price (Strategy strategy) {
        this.strategy = strategy;
    }

    public double queto (double price) {
        return strategy.calcPrice(price);
    }

}