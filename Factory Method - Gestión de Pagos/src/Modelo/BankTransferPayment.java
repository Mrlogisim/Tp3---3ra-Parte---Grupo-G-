package Modelo;

/**
 * Clase concreta para procesar pagos mediante transferencia bancaria.
 */
public class BankTransferPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Procesando el pago de $" + amount + " mediante Transferencia Bancaria.");
    }
}

