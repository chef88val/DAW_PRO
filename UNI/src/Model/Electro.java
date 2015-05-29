/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 * * @author Javier y Alex
 */


import java.io.Serializable;

public class Electro implements Serializable {
    /*
     * Titulo de la pelicula
     */

    public int consumo;
    /*
     * Nombre del director
     */
    public String aparato;
    /*
     * Anyo de producción
     */
   // public int anyo;
    public String pos;

    /**
     * Constructor nulo de pelicula
     */
    public Electro() {
        pos = "";
        aparato = "";
        consumo = 0;
        
    }

    public Electro(String aparato,  int consumo,String pos) {
        this.pos = pos;
        this.consumo = consumo;
        this.aparato = aparato;
        
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public String getAparato() {
        return aparato;
    }

    public void setAparato(String aparato) {
        this.aparato = aparato;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
  

    @Override
    public String toString() {
        return "\"" + aparato + "\", " + pos + " (" + consumo + ").";
    }
}