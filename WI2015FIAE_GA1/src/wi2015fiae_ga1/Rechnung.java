package wi2015fiae_ga1;


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author w.spiess
 */
public class Rechnung {
    public Kunde k;
    private ArrayList<Artikel> artikelliste = new ArrayList<>();

    public Rechnung(Kunde _kunde) {
        this.k = _kunde;
    }
    
    public double getGesamtbetrag(){
        double summe =0;
        for (int i = 0; i <artikelliste.size(); i++){
            Artikel a = artikelliste.get(i);
            summe = summe + a.getPreis();
        }
        
        return summe;
    }
    
    
    public void setArtikel(Artikel a){
        artikelliste.add(a);
    }
    public void drucken(){
        System.out.println("Kunde:" + k.getName());
        for(int i = 0; i < artikelliste.size(); i++){
            System.out.println(artikelliste.get(i).getBezeichnung());
        }
        System.out.println("Geseamtbetrag:" + this.getGesamtbetrag());
    }
    
}
