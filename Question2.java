// Q2.Define an abstract class Payment with an abstract method makePayment(double amount). Create subclasses CreditCardPayment and CashPayment that implement makePayment() according to the specific payment type.abstract class Payment {
    abstract void makePayment(double amount);
}

class CreditCardPayment extends Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made using Credit Card.");
    }
}

class CashPayment extends Payment {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " made using Cash.");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment creditPayment = new CreditCardPayment();
        Payment cashPayment = new CashPayment();

        creditPayment.makePayment(100.0);
        cashPayment.makePayment(50.0);
    }
}
