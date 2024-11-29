import Modelo.*;

public class App {
    public static void main(String[] args) {
        // Simulación de selección de métodos de pago
        PaymentFactory paymentFactory;

        // Pago con tarjeta de crédito
        paymentFactory = new CreditCardPaymentFactory();
        Payment creditCardPayment = paymentFactory.createPayment();
        creditCardPayment.processPayment(100.0);

        // Pago con PayPal
        paymentFactory = new PayPalPaymentFactory();
        Payment payPalPayment = paymentFactory.createPayment();
        payPalPayment.processPayment(200.0);

        // Pago mediante transferencia bancaria
        paymentFactory = new BankTransferPaymentFactory();
        Payment bankTransferPayment = paymentFactory.createPayment();
        bankTransferPayment.processPayment(300.0);
    }
}

