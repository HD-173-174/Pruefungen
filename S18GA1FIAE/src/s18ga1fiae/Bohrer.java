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
public class Bohrer extends Werkzeug{
    private int groesse;

    public Bohrer(int groesse, String art, int verschleiss) {
        super(art, verschleiss);
        this.groesse = groesse;
    }
    
    @Override
    public void ausgeben(){
        System.out.println("Bohrer mit Groesse " + groesse + " (Verschleiss "
                           + verschleiss + "%).");
    }
    
}
