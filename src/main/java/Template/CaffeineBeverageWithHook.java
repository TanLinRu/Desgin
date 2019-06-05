/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-06-05 08:53
 **/
package Template;

public abstract class CaffeineBeverageWithHook {

    final void perparerecipe() {
       boilWater();
       pourInCup();
       brew();
       if ( customerWantCondiments() ){
           addCondiments();
       }
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling Water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    boolean customerWantCondiments() {
        return true;
    }
}