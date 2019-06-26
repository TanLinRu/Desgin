/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-06-26 09:12
 **/
package Strategy;

public class NormalCustomerStrategy implements Strategy {

    public double calcPrice(double price) {
        System.out.println("对于新用户或者普通用户没有折扣");
        return price;
    }
}