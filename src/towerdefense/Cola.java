package towerdefense;

/**
 *
 * @author racatal
 */
public class Cola {

    private Nodo frente;
    private Nodo ultimo;
    private int largo;

    public Cola() {
        this.frente = null;
        this.ultimo = null;
        this.largo = 0;
    }

    //agregar al final de la cola
    public void enCola(Tropa dato) {
        Nodo nuevoNodo = new Nodo(dato, null);
        if (frente == null) {  //cola esta vacia
            frente = nuevoNodo;
            ultimo = nuevoNodo;
        } else if (nuevoNodo.getDato().isSiguiente()) {
            nuevoNodo.setAtras(frente);
            frente = nuevoNodo;
        } else {
            ultimo.setAtras(nuevoNodo);
            ultimo = nuevoNodo;
        }
        largo++;
    }

}
