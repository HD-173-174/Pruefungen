/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w17ga1fisi;

/**
 *
 * @author s.tenscher
 */
public class W17GA1FISI_ALT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String replaced = replaceLeadingZeros("2001:0db8:0000:08d3:0000:8a2e:0070:7344");
        System.out.println(replaced);
    }
    
    
    //access-modifier static/non-static return-type method-name (parameter-list)
    public static String replaceLeadingZeros(String ipv6Address){
        
        //1. Adresse in Blöcke unterteilen
        //2. führende Nullen durch X ersetzen
        //3. Blöcke wieder zusammen setzen und Adresse zurückgeben
        
        String[] blocks = ipv6Address.split(":");
        
        for(int i = 0; i < blocks.length; i++){
            if(blocks[i].startsWith("0000")){
                blocks[i] = "XXXX";
            }
            else if(blocks[i].startsWith("000")){
                blocks[i] = "XXX" + blocks[i].substring(3);
            }
            else if(blocks[i].startsWith("00")){
                blocks[i] = "XX" + blocks[i].substring(2);
            }
            else if(blocks[i].startsWith("0")){
                blocks[i] = "X" + blocks[i].substring(1);
            }
        }
        
        String res = "";
        
        for(int k = 0; k < blocks.length; k++){
            res = res + blocks[k];
            if(k < blocks.length - 1){
                res = res + ":";
            }
        }
        
        
        return res;
    }
    
}
