/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s15ga1fiae;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author s.tenscher
 */
public class KuenstlerListe {
    private List<Kuenstlergruppe> gruppen = new ArrayList<>();
    
    public void hinzufuegen(Kuenstlergruppe gruppe){
        gruppen.add(gruppe);
    }
    
    public boolean entfernen(Kuenstlergruppe gruppe){
        return gruppen.remove(gruppe);
    }
    
    public Kuenstlergruppe get(int i){
        /* entweder mit Exceptin oder durch Überprüfung der Größe der Liste möglich
        try{
          return gruppen.get(i);
        }
        catch(RuntimeException rte){
            return null;
        }
        */
        
        if(gruppen.size() > i){
            return gruppen.get(i);
        }
        else{
            return null;
        }
    }
}
