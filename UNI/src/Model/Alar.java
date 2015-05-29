/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 * * @author Javier y Alex
 */


import java.io.Serializable;

public class Alar implements Serializable {
    /*
     * Titulo de la pelicula
     */

    public String direc;
    
    /*
     * Anyo de producción
     */
    public int tlf;
    public String tipo;
    public String estado;
    /**
     * Constructor nulo de pelicula
     */
    public Alar() {
        direc = "";       
        tlf = 0;
        tipo="";
        estado="";
    }

    public Alar(String dir, int tlf,String tipo,String estado) {
        
        this.direc = dir;
        this.tlf = tlf;
        this.tipo=tipo;
        this.estado=estado;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    public String getDir() {
        return direc;
    }

    public void setDir(String dir) {
        this.direc = dir;
    }

     public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getEs() {
        return estado;
    }

    public void setEs(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        //return "\""  + direc + " (" + tlf + ")."+ "\""  + tipo;
         return "\"" + direc + "\", " + tipo +"\", " + estado + " (" + tlf + ").";
    }
}