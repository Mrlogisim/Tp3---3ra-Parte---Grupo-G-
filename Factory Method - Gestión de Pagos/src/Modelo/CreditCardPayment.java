package Modelo;

/**
 * Clase concreta para procesar pagos con tarjeta de crédito.
 */
public class CreditCardPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Procesando el pago de $" + amount + " mediante Tarjeta de Crédito.");
    }
}
