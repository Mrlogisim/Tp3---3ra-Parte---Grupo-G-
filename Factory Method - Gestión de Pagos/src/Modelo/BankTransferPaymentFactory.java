package Modelo;

/**
 * Fábrica concreta para crear pagos mediante transferencia bancaria.
 */
public class BankTransferPaymentFactory extends PaymentFactory {
    @Override
    public Payment createPayment() {
        return new BankTransferPayment();
    }
}

