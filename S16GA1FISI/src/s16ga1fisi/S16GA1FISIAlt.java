/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s16ga1fisi;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author s.tenscher
 */
public class S16GA1FISIAlt {
    
    public static void main(String[] args) throws Exception{
        
        String path = "C:\\Users\\s.tenscher\\Documents\\LogSkipass_txt.txt";
        
        int sum = Files.lines(Paths.get(path)).
                    map(l -> l.split("\\|")).
                    filter(a -> a[2].equals("30201")).
                    map(a -> a[5]).
                    map(Integer::parseInt).
                    mapToInt(i -> i).
                    sum();
        
        System.out.println(sum);
    }
}
