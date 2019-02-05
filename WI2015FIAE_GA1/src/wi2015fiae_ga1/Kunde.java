package wi2015fiae_ga1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author w.spiess
 */
public class Kunde {
    private int kundennummer;
    private String name;
    private String strasse;
    private int plz;
    private String ort;

    public Kunde(int kundennummer, String name, String strasse, int plz, String ort) {
        this.kundennummer = kundennummer;
        this.name = name;
        this.strasse = strasse;        
        if(plz <= 0 || plz > 99999){
            this.plz = 99999;
        }
        else{
            this.plz = plz;
        }
        this.ort = ort;
    } 

    public int getKundennummer() {
        return kundennummer;
    }

    public String getName() {
        return name;
    }

    public String getStrasse() {
        return strasse;
    }

    public int getPlz() {
        return plz;
    }

    public String getOrt() {
        return ort;
    }
    
    
}
