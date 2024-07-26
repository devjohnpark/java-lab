package TemplateMethodPattern;

abstract class OrderProcessTemplate {

    // 템플릿 메서드
    public final void processOrder() {
        selectProduct();
        makePayment();
        deliverProduct();
    }

    // 추상 메서드
    protected abstract void makePayment();

    // 기본적으로 제공하는 구현
    private void selectProduct() {
        System.out.println("Selecting the product.");
    }

    private void deliverProduct() {
        System.out.println("Delivering product");
    }
}
