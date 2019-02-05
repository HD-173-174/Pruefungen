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
public class Start {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kunde B = new Kunde(1, "Bauer", "Dingensstr. 27" , 55555 , "Adorf");
        Einzellizenz eliz = new Einzellizenz(1, "ms irgendwas", 100.00);
        Volumenlizenz vliz = new Volumenlizenz(10, 1, "ms wasanderes", 150.00);
        
        Rechnung r = new Rechnung(B);
        r.setArtikel(eliz);
        r.setArtikel(vliz);
        r.drucken();
        
    }
    
}
