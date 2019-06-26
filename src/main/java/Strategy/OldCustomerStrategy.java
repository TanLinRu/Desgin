/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-06-26 09:14
 **/
package Strategy;

public class OldCustomerStrategy implements Strategy {

    public double calcPrice(double price) {
        System.out.println("对于老客户，统一折扣5%");
        return price*(1-0.5);
    }
}