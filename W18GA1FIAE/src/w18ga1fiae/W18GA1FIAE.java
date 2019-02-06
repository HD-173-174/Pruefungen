/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w18ga1fiae;

/**
 *
 * @author s.tenscher
 */
public class W18GA1FIAE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SymmetrischeCodierverfahren scv = new Vigenere();
        scv.setKlarText("DERADLERISTGELANDET");
        scv.setPrivateKey("PRUEFUNG");
        System.out.println(scv.codieren());
        
        SymmetrischeCodierverfahren scvAlt = new VigenereAlt();
        scvAlt.setKlarText("DERADLERISTGELANDET");
        scvAlt.setPrivateKey("PRUEFUNG");
        System.out.println(scvAlt.codieren());
    }
    
}
