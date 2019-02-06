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
public class Musikgruppe extends Kuenstlergruppe{
    private static double aktGemaPauschale;
    private double preisProStunde;
    private String musikStil;

    public Musikgruppe(String name, String stil, double preis) {
        super(name);
        this.preisProStunde = preis;
        this.musikStil = stil;
    }

    public static double getAktGemaPauschale() {
        return aktGemaPauschale;
    }

    public double getPreisProStunde() {
        return preisProStunde;
    }
    
    public String getArt(){
        return "Musikgruppe " + musikStil;
    } 
}
