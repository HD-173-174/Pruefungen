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
public class S18GA1FIAE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        IndustrieRoboter robbie = new IndustrieRoboter();
        Bohrer bohrer1 = new Bohrer(10, "", 0);
        Bohrer bohrer2 = new Bohrer(10, "", 0);
        
        robbie.werkzeugHinzufuegen(5, bohrer1);
        robbie.werkzeugHinzufuegen(5, bohrer2);
        robbie.werkzeugHinzufuegen(10, bohrer2);
        robbie.werkzeugHinzufuegen(-1, bohrer2);
        robbie.werkzeugEntfernen(5);
        robbie.werkzeugEntfernen(5);
        robbie.werkzeugEntfernen(10);
        robbie.werkzeugEntfernen(-1);
    }
    
}
