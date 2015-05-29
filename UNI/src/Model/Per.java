/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 * * @author Javier y Alex
 */


import java.io.Serializable;

public class Per implements Serializable {
    
    public int p1;
    public int p2;
    public String hab;
    

    /**
     * Constructor nulo de pelicula
     */
    public Per() {
        p1=0;p2=0;hab="";
    }

    public Per(int p1,int p2,String hab) {
        this.p1=p1;this.p2=p2;
        this.hab=hab;
    }
    public String getHab() {
        return hab;
    }

    public void setHab(String Hab) {
        this.hab=hab;
    }
     public int getP1() {
        return p1;
    }
   public void setP1(int p1) {
       this.p1 = p1;
    }
   public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
       this.p2 = p2;
    }
    

    @Override
    public String toString() {
         return "\""  + hab + " (" + p1 + ")."+ " (" + p2 + ").";
    }
}