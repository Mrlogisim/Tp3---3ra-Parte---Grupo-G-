package Modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Clase Singleton para el manejo centralizado del registro de eventos (logging) en un sistema.
 * Garantiza que solo exista una única instancia de Logger en toda la aplicación.
 * Registra mensajes en un archivo de log y en la consola.
 * 
 * @author Grupo G
 */
public class Logger {
    private static Logger instance;
    private PrintWriter writer;

    /**
     * Constructor privado para evitar la creación directa de instancias.
     * Inicializa el archivo de log.
     * 
     * @throws RuntimeException si ocurre un error al inicializar el archivo de log.
     */
    private Logger() {
        try {
            writer = new PrintWriter(new FileWriter("app.log", true), true);
        } catch (IOException e) {
            throw new RuntimeException("Error al inicializar el archivo de log.", e);
        }
    }

    /**
     * Devuelve la única instancia de Logger. Si no existe, la crea.
     * Este método es thread-safe.
     * 
     * @return La instancia única de Logger.
     */
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }

    /**
     * Registra un mensaje de información (INFORMACION).
     * 
     * @param message El mensaje a registrar.
     */
    public void info(String message) {
        log("INFORMACION", message);
    }

    /**
     * Registra un mensaje de advertencia (ADVERTENCIA).
     * 
     * @param message El mensaje a registrar.
     */
    public void advert(String message) {
        log("ADVERTENCIA", message);
    }

    /**
     * Registra un mensaje de error (ERROR).
     * 
     * @param message El mensaje a registrar.
     */
    public void error(String message) {
        log("ERROR", message);
    }

    /**
     * Registra un mensaje genérico en el archivo de log y la consola.
     * 
     * @param level   El nivel de registro (INFORMACION, ADVERTENCIA, ERROR).
     * @param message El mensaje a registrar.
     */
    private void log(String level, String message) {
        String logMessage = String.format("[%s] %s: %s", java.time.LocalDateTime.now(), level, message);
        writer.println(logMessage);
        System.out.println(logMessage);
    }

    /**
     * Cierra el archivo de log. Debe llamarse antes de finalizar la aplicación.
     */
    public void close() {
        if (writer != null) {
            writer.close();
        }
    }
}


