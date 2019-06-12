/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-06-12 09:25
 **/
package Iterator;

import com.sun.org.glassfish.gmbal.Description;

public class MenuItem extends MenuComponent {

    String name;
    String description;
    boolean vegetarian;
    double price;

    public MenuItem(String name,String description,boolean vegetarian,double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(" "+getName());
        if (isVegetarian()) {
            System.out.print("V");
        }
        System.out.println(","+getPrice()+"  ---"+getDescription());
    }
}