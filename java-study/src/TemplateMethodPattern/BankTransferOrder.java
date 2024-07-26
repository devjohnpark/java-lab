package TemplateMethodPattern;

class BankTransferOrder extends OrderProcessTemplate {

    @Override
    protected void makePayment() {
        System.out.println("Processing bank transfer payment.");
    }

}

