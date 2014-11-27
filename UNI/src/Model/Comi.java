/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 * * @author Javier y Alex
 */


import java.io.Serializable;

public class Comi implements Serializable {
    public int w_ini;    public int w_fin;    
       public int t_ini;    public int t_fin;
    public String hab;

    /**
     * Constructor nulo de pelicula
     */
    public Comi() {
        w_ini=0;w_fin=0;
        t_ini=0;t_fin=0;
        hab="";
    }

    public Comi(int w_ini, int w_fin,int t_ini, int t_fin,String hab) {
         this.w_ini=w_ini;this.w_fin=w_fin;
         this.t_ini=t_ini;this.t_fin=t_fin;
        this.hab=hab;
    }
    public int getW_ini() {
        return w_ini;
    }

    public void setW_ini(int w_ini) {
       this.w_ini = w_ini;
    }
    public int getW_fin() {
        return w_fin;
    }

    public void setW_fin(int w_fin) {
       this.w_fin = w_fin;
    }
    
    public int getT_ini() {
        return t_ini;
    }

    public void setT_ini(int t_ini) {
       this.t_ini = t_ini;
    }
    public int getT_fin() {
        return t_fin;
    }

    public void setT_fin(int t_fin) {
       this.t_fin = t_fin;
    }
    public String getHab() {
        return hab;
    }

    public void setHab(String Hab) {
        this.hab=hab;
    }


    @Override
    public String toString() {
        return "\"" + hab + " (" + w_ini + ")."+ " (" + t_ini + ")."
                + " (" + w_fin + ")."+ " (" + t_fin + ").";
    }
}