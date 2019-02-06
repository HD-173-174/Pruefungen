/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s15ga1fiae;

/**
 *
 * @author s.tenscher
 */
public class Artistengruppe extends Kuenstlergruppe{
    private double pauschalPreis;
    private String genre;

    public Artistengruppe(String name, String genre, double preis) {
        super(name);
        this.pauschalPreis = preis;
        this.genre = genre;
    }

    public double getPauschalPreis() {
        return pauschalPreis;
    }

    public String getArt() {
        return genre;
    }
    
    

    
    
    
}
