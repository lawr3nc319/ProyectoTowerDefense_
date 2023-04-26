package towerdefense;
import java.lang.String;

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
   public void enCola(Tropa tipo){
        Nodo temp = new Nodo(tipo.getTipo());
        if(frente == null){ //significa que la cola esta vacia
            frente = temp;
            ultimo = temp;
        } else{
            ultimo.setAtras(temp);
            ultimo = temp;
        }
        largo++;
    }

}
