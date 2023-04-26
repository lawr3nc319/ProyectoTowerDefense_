package towerdefense;

/**
 *
 * @author Marita
 */
public class Castillo {

    private double vida;

    public Castillo() {
        vida = 10;
    }

    public double getVida() {
        return vida;
    }

    public void recibirAtaque(int ataque) {
        vida -= ataque;
    }
}


