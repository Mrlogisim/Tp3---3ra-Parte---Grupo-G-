import Modelo.FlightBooking;

public class App {
    public static void main(String[] args) {
        // Crear una reserva de vuelo personalizada
        FlightBooking booking1 = new FlightBooking.FlightBookingBuilder()
                .setSeatSelection("Ventana")
                .setExtraBaggage(2)
                .setMealPreference("Vegetariana")
                .setPremiumServices(true)
                .build();

        System.out.println(booking1);

        // Crear otra reserva de vuelo con diferentes configuraciones
        FlightBooking booking2 = new FlightBooking.FlightBookingBuilder()
                .setSeatSelection("Pasillo")
                .setExtraBaggage(1)
                .setMealPreference("Estándar")
                .setPremiumServices(false)
                .build();

        System.out.println(booking2);
    }
}


