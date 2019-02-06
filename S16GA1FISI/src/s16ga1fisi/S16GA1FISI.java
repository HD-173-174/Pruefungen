/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s16ga1fisi;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author s.tenscher
 */
public class S16GA1FISI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File skiLog = new File("C:\\Users\\s.tenscher\\Documents\\LogSkipass_txt.txt");
        
        int summe = 0;
        
        Scanner sc;
        try{
            sc = new Scanner(skiLog);
            String line;
            while(sc.hasNextLine()){
                line = sc.nextLine();
                String[] splitLine = line.split("\\|");
                if(splitLine[2].equals("30201")){
                    summe = summe + Integer.parseInt(splitLine[5]);
                }
            }
        }
        catch(IOException ioe){
            
        }
        
        System.out.println("Die Summe der Liftlängen beträgt " + summe + ".");
    }
    
}
