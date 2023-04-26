
package towerdefense;

/**
 *
 * @author lawwb, racatal
 */
public class Cronometro {
    public void cronometro() throws InterruptedException{
        long inicio = System.currentTimeMillis(); // obtener la hora actual del sistema
        while (true) {
            long actual = System.currentTimeMillis();
            long tiempoTranscurrido = actual - inicio; // calcular el tiempo transcurrido
            long segundos = (tiempoTranscurrido / 1000) % 60; // calcular los segundos transcurridos
            long minutos = (tiempoTranscurrido / (1000 * 60)) % 60; // calcular los minutos transcurridos
            long horas = (tiempoTranscurrido / (1000 * 60 * 60)) % 24; // calcular las horas transcurridas
            System.out.print("\r" + String.format("Tiempo transcurrido: "
                    + "%02d:%02d:%02d", horas, minutos, segundos)); // imprimir el tiempo en consola
            Thread.sleep(1000); // esperar un segundo antes de continuar
        }
    }
}
