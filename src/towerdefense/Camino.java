
package towerdefense;

/**
 *
 * @author racatal
 */
public class Camino {
    private Tropa[] tropas;
    
    public Camino() {
        tropas = new Tropa[10];
    }
    
    public void colocarTropa(Tropa tropa, int posicion) {
        tropas[posicion] = tropa;
    }
    
    public Tropa getTropa(int posicion) {
        return tropas[posicion];
    }
    
}
