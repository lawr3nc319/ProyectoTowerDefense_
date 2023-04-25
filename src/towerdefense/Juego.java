package towerdefense;

import java.util.Scanner;

/**
 *
 * @author lawwb, racatal
 */
public class Juego {

    public void jugar() {
        // Inicialización de variables
        int vidaJugador = 10; // Vida inicial del jugador
        int vidaCPU = 10; // Vida inicial del CPU
        int oleada = 1; // Número de oleada actual
        int tropasJugador = 0; // Cantidad de tropas que el jugador puede colocar en el tablero
        int tropasCPU = 0; // Cantidad de tropas que el CPU puede colocar en el tablero
        boolean turnoJugador = true; // Indica si es el turno del jugador o del CPU
        int tiempo = 0; // Tiempo transcurrido en segundos

        // Bucle principal del juego
        while (vidaJugador > 0 && vidaCPU > 0) {
            // Preparación de la oleada actual
            tropasJugador = oleada + 4;
            tropasCPU = oleada + 3;
            if (tropasCPU > (int) (0.75 * tropasJugador)) {
                tropasCPU = (int) (0.75 * tropasJugador);
            }
            // Selección de tropas por parte del jugador
            int tropasRestantes = oleada + 4; // número de tropas que puede seleccionar el jugador                        
            int magos = 0;
            int arqueros = 0;
            int caballeros = 0;

            while (tropasRestantes > 0) {
                // aquí se podría mostrar al jugador las opciones de tropas y dejarlo seleccionar
                int numOleada = 1; // Número de la oleada actual
                int maxTropas = numOleada + 4; // Cantidad máxima de tropas permitida por oleada

                // Definir las opciones de tropas disponibles
                String[] opcionesTropas = {"Mago", "Caballero", "Arquero"};
                // Mostrar las opciones de tropas al jugador
                System.out.println("Opciones de tropas disponibles:");
                for (int i = 0; i < opcionesTropas.length; i++) {
                    System.out.println((i + 1) + ". " + opcionesTropas[i]);
                }

                // Dejar que el jugador seleccione sus tropas
                int[] seleccionJugador = new int[opcionesTropas.length];
                Scanner scanner = new Scanner(System.in);

                for (int i = 0; i < opcionesTropas.length; i++) {
                    System.out.print("¿Cuántas tropas de " 
                            + opcionesTropas[i] + " desea enviar? ");
                    int cantidad = scanner.nextInt();

                    // Verificar que la cantidad seleccionada no exceda el máximo 
                    //permitido por oleada
                    while (cantidad > maxTropas) {
                        System.out.println("No puede enviar más de " 
                                + maxTropas + " tropas en esta oleada.");
                        System.out.print("¿Cuántas tropas de " + 
                                opcionesTropas[i] + " desea enviar? ");
                        cantidad = scanner.nextInt();
                    }

                    seleccionJugador[i] = cantidad;
                }

            }
        }
    }
}
