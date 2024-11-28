import Modelo.Logger;

public class Main {
    public static void main(String[] args) {
        // Se simulan múltiples hilos escribiendo en el log
        Thread thread1 = new Thread(() -> {
            Logger logger = Logger.getInstance();
            logger.info("Hilo 1 inició el proceso.");
            logger.advert("Hilo 1 encontró una advertencia.");
            logger.error("Hilo 1 encontró un error.");
        });

        Thread thread2 = new Thread(() -> {
            Logger logger = Logger.getInstance();
            logger.info("Hilo 2 inició el proceso.");
            logger.advert("Hilo 2 encontró una advertencia.");
            logger.error("Hilo 2 encontró un error.");
        });

        // Ejecución de hilos
        thread1.start();
        thread2.start();

        // Se espera a que terminen los hilos
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Se cierra el logger
        Logger.getInstance().close();
    }
}
