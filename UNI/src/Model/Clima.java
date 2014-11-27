/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 * * @author Javier y Alex
 */


import java.io.Serializable;

public class Clima implements Serializable {
    /*
     * Titulo de la pelicula
     */

    public int temp;
    /*
     * Nombre del director
     */
    public int ini;
    /*
     * Anyo de producción
     */
    public int fin;
    public String hab;

    /**
     * Constructor nulo de pelicula
     */
    public Clima() {
        fin = 0;
        ini = 0;
        temp = 0;
        hab="";
    }

    public Clima(int temp, int ini, int fin,String hab) {
        this.ini = ini;
        this.fin = fin;
        this.temp = temp;
        this.hab=hab;
    }

    public int getIni() {
        return ini;
    }

    public void setIni(int ini) {
       this.ini = ini;
    }
    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
       this.temp = temp;
    }
    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
       this.fin = fin;
    }

    public String getHab() {
        return hab;
    }

    public void setHab(String Hab) {
        this.hab=hab;
    }

   

    @Override
    public String toString() {
        return "\""  + hab + " (" + temp + ")."+ " (" + ini + ")."+ " (" + fin + ").";
    }
}