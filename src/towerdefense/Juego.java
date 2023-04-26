package towerdefense;

import java.util.Scanner;

/**
 *
 * @author lawwb, racatal, Marita
 */
public class Juego {

    public void jugar() throws InterruptedException {
        // Inicialización de variables
        int vidaJugador = 10; // Vida inicial del jugador
        int vidaCPU = 10; // Vida inicial del CPU
        int oleada = 1; // Número de oleada actual
        int tropasJugador = 0; // Cantidad de tropas que el jugador puede colocar en el tablero
        int tropasCPU = 0; // Cantidad de tropas que el CPU puede colocar en el tablero
        boolean turnoJugador = true; // Indica si es el turno del jugador o del CPU
        int tiempo = 0; // Tiempo transcurrido en segundos
        Arquero arquero = new Arquero();
        Caballero caballero = new Caballero();
        Mago mago = new Mago();
        
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
                        System.out.print("¿Cuántas tropas de "
                                + opcionesTropas[i] + " desea enviar? ");
                        cantidad = scanner.nextInt();
                    }

                    seleccionJugador[i] = cantidad;
                }
                // Mostrar las tropas seleccionadas por el jugador
                System.out.println("Tropas seleccionadas por el jugador:");
                for (int i = 0; i < opcionesTropas.length; i++) {
                    System.out.println(opcionesTropas[i] + ": " + seleccionJugador[i]);
                }
                // Realizar la selección de tropas por parte del CPU de manera aleatoria
                // por ejemplo, mediante un menú en consola o una interfaz gráfica
                // supongamos que el jugador seleccionó un mago
                magos++;
                tropasRestantes--;
            }

            // Selección de tropas por parte del CPU
            tropasRestantes = oleada + 3; // el CPU tiene una tropa menos que el jugador
            int cpuMagos = 0;
            int cpuArqueros = 0;
            int cpuCaballeros = 0;

            while (tropasRestantes > 0 && cpuMagos + cpuArqueros + cpuCaballeros < 0.75 * tropasRestantes) {
                // aquí el CPU podría elegir de manera aleatoria qué tropa enviar y por qué camino
                // supongamos que el CPU seleccionó un arquero y lo enviará por el camino 2
                cpuArqueros++;
                tropasRestantes--;
            }

            // Inicio de la oleada
            while (tropasJugador > 0 && tropasCPU > 0 && vidaJugador > 0 && vidaCPU > 0) {
                if (turnoJugador) {
                    // Turno del jugador
                    // Colocación de tropa del jugador en el tablero
                    // ...
                    // Movimiento de tropas del jugador
                    // ...
                    // Comprobación de choques entre tropas y resolución de combate
                    // ...
                    // Comprobación de si se ha alcanzado el castillo del CPU y ataque al mismo
                    // ...
                    // Actualización del número de tropas disponibles para el jugador
                    tropasJugador--;
                    // Cambio de turno al CPU
                    turnoJugador = false;
                } else {

                    // Turno del CPU
                    // Colocación de tropa del CPU en el tablero
                    // ...
                    // Movimiento de tropas del CPU
                    // ...
                    // Comprobación de choques entre tropas y resolución de combate
                    // ...
                    // Comprobación de si se ha alcanzado el castillo del jugador y ataque al mismo
                    // ...
                    // Actualización del número de tropas disponibles para el CPU
                    tropasCPU--;
                    // Cambio de turno al jugador
                    turnoJugador = true;
                }
                // Incremento del tiempo transcurrido
                tiempo++;
            }
            // Incremento del número de oleada
            oleada++;
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
