package Oops;

public abstract class Payment {
    public abstract void processPayment();
}

 class CreditCardPayment extends Payment {
    @Override
    public void processPayment() {
        // Process credit card payment
    }
}

 class PayPalPayment extends Payment {
    @Override
    public void processPayment() {
        // Process PayPal payment
    }
}
