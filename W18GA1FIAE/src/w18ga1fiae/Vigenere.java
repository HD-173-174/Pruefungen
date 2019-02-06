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
public class Vigenere extends SymmetrischeCodierverfahren{
    
    @Override
    public String codieren(){
        
        String kt = getKlarText();
        String pk = privateKey;
        
        while(pk.length() < kt.length()){
            pk += pk;
        }
        
        pk = pk.substring(0, kt.length());
        
        char[] ktChars = kt.toCharArray();
        char[] pkChars = pk.toCharArray();
        char[] codeWortChars = new char[kt.length()];
        
        for(int i = 0; i < ktChars.length; i++){
            int charVal = (((ktChars[i] - 'A') + (pkChars[i] - 'A')) % 26) + 'A';
            codeWortChars[i] = (char)charVal;
        }
        
        String codeWort = new String(codeWortChars);
        return codeWort;
    }
}
