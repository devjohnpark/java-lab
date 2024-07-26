package TemplateMethodPattern;

public class TemplateMethodPatternDemo {
    public static void main(String[] args) {
        OrderProcessTemplate bankTransferOrder = new BankTransferOrder();
        bankTransferOrder.processOrder();

        System.out.println();

        OrderProcessTemplate directDepositOrder = new DirectDepositOrder();
        directDepositOrder.processOrder();

        System.out.println();

        OrderProcessTemplate cardPaymentOrder = new CardPaymentOrder();
        cardPaymentOrder.processOrder();
    }
}
