/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmap;

import java.util.*;

/**
 *
 * @author vanes
 */
public class TestMAp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //HashMap<String, Integer> score = new HashMap<String,Integer>();
        TreeSet score = new TreeSet();
        
        /*score.put("Vanessa", 20);
        score.put("Amanda", 22);
        score.put("Valeria", 29);*/
        
        score.add("Vanessa");
        score.add("Amanda Pinheiro");
        score.add("Valeria");
        
        Iterator it = score.iterator();
        
        while(it.hasNext())
            System.out.println(it.next()+" ");
        //System.out.println(score);
        //System.out.println(score.get("Valeria"));
    }
    
}
