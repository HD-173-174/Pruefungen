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
public class IndustrieRoboter {
    private static final int maxAnzWerkzeuge = 10; 
    private Werkzeug[] werkzeugKasten = new Werkzeug[maxAnzWerkzeuge];

    public IndustrieRoboter() {
    }
    
    public boolean werkzeugHinzufuegen(int platz, Werkzeug neu){
        
        if(platz < 0 || platz > 9){
            System.out.println("Kein Werkzeug hinzugefuegt, da Platz " + platz 
                               + " nicht existiert");
            return false;
        }
        else if(werkzeugKasten[platz] != null){
            System.out.println("Kein Werkzeug hinzugefuegt, da Platz " + platz 
                               + " bereits belegt");
            return false;
        }
        else{
            werkzeugKasten[platz] = neu;
            
            System.out.print("Das Werkzeug ");
            neu.ausgeben();
            System.out.println(" wurde an Platz " + platz + " hinzugefuegt.");
            return true;
        }
    }
    
    public boolean werkzeugEntfernen(int platz){
        
        if(platz < 0 || platz > 9){
            System.out.println("Kein Werkzeug entfernt, da Platz " + platz 
                               + " nicht existiert");
            return false;
        }
        else if(werkzeugKasten[platz] == null){
            System.out.println("Kein Werkzeug entfernt, da an Platz " + platz 
                               + " keines vorhanden war.");
            return false;
        }
        else{
            Werkzeug temp = werkzeugKasten[platz];
            werkzeugKasten[platz] = null;
            
            System.out.print("Das Werkzeug ");
            temp.ausgeben();
            System.out.println(" wurde von Platz " + platz + " entfernt.");
            return true;
        }
    }
    
    
    
    
    
}
