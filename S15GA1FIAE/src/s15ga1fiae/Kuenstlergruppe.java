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
public abstract class Kuenstlergruppe {
    private String name;

    public Kuenstlergruppe(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public abstract String getArt();
}
