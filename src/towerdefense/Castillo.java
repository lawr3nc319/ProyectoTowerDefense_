package towerdefense;

/**
 *
 * @author Marita
 */
public class Castillo {

    private int vida;

    public Castillo() {
        vida = 10;
    }

    public int getVida() {
        return vida;
    }

    public void recibirAtaque(int ataque) {
        vida -= ataque;
    }
}
