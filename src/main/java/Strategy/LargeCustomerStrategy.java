/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-06-26 09:13
 **/
package Strategy;

public class LargeCustomerStrategy implements Strategy {

    public double calcPrice(double price) {
        System.out.println("对于大客户，统一折扣10");
        return price*(1-0.1);
    }
}