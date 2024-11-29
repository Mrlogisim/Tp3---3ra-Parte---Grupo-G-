package Modelo;

/**
 * Clase abstracta para la creación de métodos de pago.
 */
public abstract class PaymentFactory {
    /**
     * Método Factory para crear un método de pago.
     * 
     * @return Una instancia de la clase que implementa Payment.
     */
    public abstract Payment createPayment();
}

