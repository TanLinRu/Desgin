/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-29 09:20
 **/
package Adapter;

public class AdapterTest {
   public static void main(String[] args) {
       Bird bird = new MallmardBird();
       System.out.println("Bird1 say:");
       bird.quack();
       bird.fly();


       Bird bird1 = new TurkeyAdapter(new WildTurkey());
       System.out.println("Bird2 say:");
       bird1.quack();
       bird1.fly();

       Turkey turkey = new WildTurkey();
       System.out.println("Turkey1 say:");
       turkey.gobble();
       turkey.fly();


       Turkey turkey1 = new BirdAdapter(new MallmardBird());
       System.out.println("Turkey2 say:");
       turkey1.gobble();
       turkey1.fly();

   }
}