/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s14ga1fiae;

/**
 *
 * @author s.tenscher
 */
public abstract class Produkt {
    public static int anzahl;
    public static int ausschuss;
    protected String zustand = "";
    protected int produktNr;
    protected String produktTyp = "";

    public String getZustand() {
        return zustand;
    }

    public void setZustand(String zustand) {
        this.zustand = zustand;
    }

    public int getProduktNr() {
        return produktNr;
    }

    public void setProduktNr(int produktNr) {
        this.produktNr = produktNr;
    }

    public String getProduktTyp() {
        return produktTyp;
    }

    public void setProduktTyp(String produktTyp) {
        this.produktTyp = produktTyp;
    }
    
    public abstract int pruefen();
    
}
