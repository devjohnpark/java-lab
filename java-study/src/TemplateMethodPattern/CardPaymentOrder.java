package TemplateMethodPattern;

class CardPaymentOrder extends OrderProcessTemplate {

    @Override
    protected void makePayment() {
        System.out.println("Processing card payment.");
    }
}
