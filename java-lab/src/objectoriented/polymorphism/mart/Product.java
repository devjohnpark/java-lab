package objectoriented.polymorphism.mart;

public class Product {
    private int price;
    private int bonusPoint;

    public Product(int price) {
        this.setPrice(price); // Use the setter to ensure bonusPoint is set correctly
    }

    public int getPrice() {
        return price;
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    public void setPrice(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }
}
