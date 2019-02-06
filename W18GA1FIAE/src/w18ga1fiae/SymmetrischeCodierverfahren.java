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
public abstract class SymmetrischeCodierverfahren {
    protected String klarText;
    protected String privateKey;

    public SymmetrischeCodierverfahren() {
    }

    public String getKlarText() {
        return klarText;
    }

    public void setKlarText(String klarText) {
        this.klarText = klarText;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }
    
    public abstract String codieren();
}
