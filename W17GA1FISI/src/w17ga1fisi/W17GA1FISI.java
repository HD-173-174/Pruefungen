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
public class W17GA1FISI {

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
            for(int j = 0; j < 4; j++){
                if(blocks[i].charAt(j) == '0'){
                    char[] temp = blocks[i].toCharArray();
                    temp[j] = 'X';
                    blocks[i] = String.valueOf(temp);
                }
                else{
                    break;
                }
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
