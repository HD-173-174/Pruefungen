/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s18ga1fiae;

/**
 *
 * @author s.tenscher
 */
public abstract class Werkzeug {
    private String art;
    protected int verschleiss;

    public Werkzeug(String art, int verschleiss) {
        this.art = art;
        if(verschleiss >= 0 && verschleiss <= 100){
          this.verschleiss = verschleiss;
        }
    }
    
    public abstract void ausgeben();
       
}
