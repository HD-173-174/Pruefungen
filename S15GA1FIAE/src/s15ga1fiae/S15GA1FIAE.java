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
public class S15GA1FIAE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KuenstlerListe kl = new KuenstlerListe();
        Musikgruppe m1 = new Musikgruppe("Die Heuler", "Oompa", 0.99);
        kl.hinzufuegen(m1);
        Musikgruppe m2 = new Musikgruppe("Die Pfeifer", "Oompa", 0.99);
        kl.hinzufuegen(m2);
        Artistengruppe a1 = new Artistengruppe("Die Keuler", "Jonglage", 0.99);
        kl.hinzufuegen(a1);
        System.out.println(kl.get(1));
        System.out.println(kl.get(4));
        System.out.println(kl.entfernen(m1));
        System.out.println(kl.entfernen(new Artistengruppe("a","b",123)));
        
    }
    
}
