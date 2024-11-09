package objectoriented.polymorphism.interfaces.account.forinterface;

interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    void setTransactionLimit(double limit);
    double getTransactionLimit();
}
