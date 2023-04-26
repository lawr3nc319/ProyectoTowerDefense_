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
    private double ataque;
    private String debilidad;

    public Tropa(String tipo, double ataque, String debilidad) {
        this.tipo = tipo;
        this.ataque = ataque;
        this.debilidad = debilidad;
    }

    public String getTipo() {
        return tipo;
    }    

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }       
}
