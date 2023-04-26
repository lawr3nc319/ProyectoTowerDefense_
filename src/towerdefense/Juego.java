package towerdefense;

import java.util.Scanner;

/**
 *
 * @author lawwb, racatal, Marita
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
        Tropa tropa1 = new Tropa ("Mago", 1.5, "Arquero");
        Tropa tropa2 = new Tropa ("Arquero", 1, "Caballero");
        Tropa tropa3 = new Tropa ("Caballero", 2, "Mago");
        
        // Bucle principal del juego
        while (colaTropaCPU >= tropaCPU) {
            int min = 1;
            int max = 3;
            int range = max - min + 1;
            
        }
            

        // Fin del juego
        if (vidaJugador <= 0) {
            System.out.println("¡El CPU ha ganado!");
        } else if (vidaCPU <= 0) {
            System.out.println("¡El jugador ha ganado!");
        }

        //Cronometro
    }
}
