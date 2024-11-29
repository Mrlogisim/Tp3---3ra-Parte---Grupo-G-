package Modelo;

/**
 * Clase concreta para procesar pagos con PayPal.
 */
public class PayPalPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Procesando el pago de $" + amount + " mediante PayPal.");
    }
}

