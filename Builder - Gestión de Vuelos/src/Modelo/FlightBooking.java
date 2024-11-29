package Modelo;

/**
 * Clase que representa una reserva de vuelo.
 */
public class FlightBooking {
    private String seatSelection;
    private int extraBaggage;
    private String mealPreference;
    private boolean premiumServices;

    // Constructor privado para ser usado por el Builder
    private FlightBooking(FlightBookingBuilder builder) {
        this.seatSelection = builder.seatSelection;
        this.extraBaggage = builder.extraBaggage;
        this.mealPreference = builder.mealPreference;
        this.premiumServices = builder.premiumServices;
    }

    // Getters para los atributos (opcional, según se necesiten)
    public String getSeatSelection() {
        return seatSelection;
    }

    public int getExtraBaggage() {
        return extraBaggage;
    }

    public String getMealPreference() {
        return mealPreference;
    }

    public boolean hasPremiumServices() {
        return premiumServices;
    }

    @Override
    public String toString() {
        return "FlightBooking{" +
               "Selección de asiento='" + seatSelection + '\'' +
               ", Equipaje adicional=" + extraBaggage +
               ", Preferencia de comida='" + mealPreference + '\'' +
               ", Servicio premium=" + premiumServices +
               '}';
    }

    /**
     * Clase Builder para construir instancias de FlightBooking.
     */
    public static class FlightBookingBuilder {
        private String seatSelection;
        private int extraBaggage;
        private String mealPreference;
        private boolean premiumServices;

        /**
         * Método para establecer la selección de asiento.
         * @param seatSelection El asiento seleccionado.
         * @return El mismo builder para encadenar métodos.
         */
        public FlightBookingBuilder setSeatSelection(String seatSelection) {
            this.seatSelection = seatSelection;
            return this;
        }

        /**
         * Método para establecer la cantidad de equipaje adicional.
         * @param extraBaggage La cantidad de equipaje adicional.
         * @return El mismo builder para encadenar métodos.
         */
        public FlightBookingBuilder setExtraBaggage(int extraBaggage) {
            this.extraBaggage = extraBaggage;
            return this;
        }

        /**
         * Método para establecer la preferencia de comida.
         * @param mealPreference La preferencia de comida.
         * @return El mismo builder para encadenar métodos.
         */
        public FlightBookingBuilder setMealPreference(String mealPreference) {
            this.mealPreference = mealPreference;
            return this;
        }

        /**
         * Método para habilitar o deshabilitar servicios premium.
         * @param premiumServices Si se desea habilitar servicios premium.
         * @return El mismo builder para encadenar métodos.
         */
        public FlightBookingBuilder setPremiumServices(boolean premiumServices) {
            this.premiumServices = premiumServices;
            return this;
        }

        /**
         * Método para construir la instancia de FlightBooking.
         * @return Una instancia configurada de FlightBooking.
         */
        public FlightBooking build() {
            return new FlightBooking(this);
        }
    }
}

