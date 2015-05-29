/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 * * @author Javier y Alex
 */


import java.io.Serializable;

public class Control implements Serializable {
    /*
     * Titulo de la pelicula
     */

    public String titulo;
    /*
     * Nombre del director
     */
    public String director;
    /*
     * Anyo de producción
     */
    public int anyo;
    public String direcc;

    /**
     * Constructor nulo de pelicula
     */
    public Control() {
        titulo = "";
        director = "";
        anyo = 0;
        direcc="";
    }

    public Control(String titulo, String director, int anyo,String direcc) {
        this.titulo = titulo;
        this.director = director;
        this.anyo = anyo;
        this.direcc=direcc;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String direcc) {
        this.titulo = titulo;
    }
    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

    @Override
    public String toString() {
        return "\"" + titulo + "\", " + director + " (" + anyo + ").";
    }
}