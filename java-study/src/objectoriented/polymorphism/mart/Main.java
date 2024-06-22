package objectoriented.polymorphism.mart;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {

    public static void main(String[] args) {
        Tv tv = new Tv(1000000);
        Smartphone smartphone = new Smartphone(700000);
        Refrigerator refrigerator = new Refrigerator(3000000);
        Buyer buyer = new Buyer(4000000);
        buyer.buyProduct(tv);
        buyer.buyProduct(smartphone);
        buyer.buyProduct(refrigerator);
        buyer.summaryMyItems();

        buyer.refundProduct(smartphone);
        buyer.buyProduct(refrigerator);
        buyer.summaryMyItems();
    }
}
