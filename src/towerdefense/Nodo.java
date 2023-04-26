
package towerdefense;

/**
 *
 * @author racatal
 */
public class Nodo {
    private Tropa tipo;
    private Nodo atras;

    public Nodo(Tropa tipo) {
        this.tipo = tipo;
    }

    public Tropa getTipo() {
        return tipo;
    }

    public void setTipo(Tropa tipo) {
        this.tipo = tipo;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }

}
