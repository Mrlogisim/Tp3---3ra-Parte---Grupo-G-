package Modelo;

/**
 * Fábrica concreta para crear pagos con PayPal.
 */
public class PayPalPaymentFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new PayPalPayment();
    }
}

