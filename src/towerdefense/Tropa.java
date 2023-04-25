/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package towerdefense;

/**
 *
 * @author lawwb
 */
public class Tropa {
    private String tipo;
    private int ataque;
    private String debilidad;
    
    public Tropa(String tipo, int ataque, String debilidad) {
        this.tipo = tipo;
        this.ataque = ataque;
        this.debilidad = debilidad;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public int getAtaque() {
        return ataque;
    }
    
    public String getDebilidad() {
        return debilidad;
    }
}
