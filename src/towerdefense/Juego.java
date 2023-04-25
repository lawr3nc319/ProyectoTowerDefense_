/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package towerdefense;

/**
 *
 * @author lawwb
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
    
    
    
    }
  }
}
