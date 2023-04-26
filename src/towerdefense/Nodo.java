
package towerdefense;

/**
 *
 * @author racatal
 */
public class Nodo {
    private Tropa dato;
    private Nodo atras;

    public Nodo(Tropa dato) {
        this.dato = dato;
        this.atras = null;
    }           

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }

    public Tropa getDato() {
        return dato;
    }

    public void setDato(Tropa dato) {
        this.dato = dato;
    }        
}
