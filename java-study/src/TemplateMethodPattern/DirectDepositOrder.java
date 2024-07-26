package TemplateMethodPattern;

class DirectDepositOrder extends OrderProcessTemplate {

    @Override
    protected void makePayment() {
        System.out.println("Processing direct deposit payment.");
    }
}
