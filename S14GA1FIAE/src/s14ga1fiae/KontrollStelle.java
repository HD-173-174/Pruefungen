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
public class KontrollStelle {
    
    public void kontrollieren(Fenster myWin){
        
        int pruefZiffer;
        boolean weiterPruefen = true;
        
        while(weiterPruefen){
            pruefZiffer = myWin.pruefen();
            
            switch(pruefZiffer){
                case 1:
                    myWin.setZustand("inOrdnung");
                    weiterPruefen = false;
                    break;
                case 2:
                    myWin.setZustand("Nachbessern");
                    nachbessern();
                    break;
                case 3:
                    myWin.setZustand("Ausschuss");
                    Produkt.ausschuss++;
                    weiterPruefen = false;
                    break;
            }
        }
    }
    
    public void nachbessern(){
        
    }
}
