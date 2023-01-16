/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11.pkg10;

import java.util.*;

/**
 *
 * @author vanes
 */
public class ArtistCompare implements Comparator<Song>{

    @Override
    public int compare(Song t, Song t1) {
        return t.compareTo(t1); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
