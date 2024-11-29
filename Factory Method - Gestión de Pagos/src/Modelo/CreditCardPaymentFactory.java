package Modelo;

/**
 * Fábrica concreta para crear pagos con tarjeta de crédito.
 */
public class CreditCardPaymentFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new CreditCardPayment();
    }
}

