package objectoriented.polymorphism.mart;

import java.util.ArrayList; // class
import java.util.List; // interface
import java.util.Vector;

public class Buyer {
    private int money;
    private int bonusPoint;
//    private Product[] items;
    private List<Product> items = new ArrayList<Product>();;
//    private Vector<Product> items = new Vector<Product>();


    public Buyer(int money) {
        this.money = money;
    }

    public int getMoney() { return money; }
    public void setMoney(int money) { this.money = money; }
    public int getBonusPoint() { return bonusPoint; }
    public void setBonusPoint(int bonusPoint) { this.bonusPoint = bonusPoint;}

    public void buyProduct(Product product) {
        if (money < product.getPrice()) {
            System.out.println("You don't have enough money to buy a " + product.getClass().getSimpleName().toLowerCase());
            return;
        }
        money -= product.getPrice();
        bonusPoint += product.getBonusPoint();
        items.add(product);
        System.out.println("You bought a " + product.getClass().getSimpleName().toLowerCase());
    }

    public void refundProduct(Product product) {
        if (!items.remove(product)) {
            System.out.println("The specified product is not among the purchased items.");
            return;
        }
        money += product.getPrice();
        bonusPoint -= product.getBonusPoint();
        System.out.println("You refund a " + product.getClass().getSimpleName().toLowerCase());
    }

    public void summaryMyItems() {
        int sum = 0;

        if (items.isEmpty()) {
            System.out.println("You don't have any items.");
            return;
        }

        for (Product product : items) {
            System.out.println(product.getClass().getSimpleName().toLowerCase() + ": " + product.getPrice());
            sum += product.getPrice();
        }
        System.out.println("The sum of the items is: " + sum);
    }
}
