package Modelo;

/**
 * Interfaz que define el contrato para los métodos de pago.
 */
public interface Payment {
    /**
     * Procesa el pago con los detalles proporcionados.
     * 
     * @param amount El monto a pagar.
     */
    void processPayment(double amount);
}
