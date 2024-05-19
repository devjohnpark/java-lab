package objectoriented;

class Coffee {
    String beanName;
    int density;

    Coffee() {
        this("Arabica", 0);
    }

    Coffee(String beanName) {
        this(beanName, 0);
    }

    Coffee(String beanName, int density) {
        this.beanName = beanName;
        this.density = density;
    }

    Coffee(Coffee coffee) {
        this(coffee.beanName, coffee.density);
    }

    public static void main(String[] args) {
        Coffee coffee1 = new Coffee("Arabica", 1);
        Coffee coffee2 = new Coffee(coffee1);

        System.out.printf("coffee1 %s %s %d\n", coffee1, coffee1.beanName, coffee1.density);
        System.out.printf("coffee2 %s %s %d\n", coffee2, coffee2.beanName, coffee2.density);
    }

}
