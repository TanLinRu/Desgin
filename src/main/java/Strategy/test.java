/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-06-26 09:19
 **/
package Strategy;

public class test {

    public static void main (String[] args) {
        Price price = new Price(new LargeCustomerStrategy());
        System.out.println("向客户报价："+price.queto(1000));
    }

}