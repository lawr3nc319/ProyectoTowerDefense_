package towerdefense;

/**
 *
 * @author lawwb
 */
public class TowerDefense {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    //main del juego
    public static void main(String[] args)throws InterruptedException {
        Juego juego = new Juego();
        Cronometro cronometro = new Cronometro();
          
        cronometro.cronometro();
        juego.jugar() ;
        
    }
    
}
