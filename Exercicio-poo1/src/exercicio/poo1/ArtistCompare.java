/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.poo1;

import java.util.Comparator;

/**
 *
 * @author vanes
 */
public class ArtistCompare implements Comparator <Song> {

    @Override
    public int compare(Song t, Song t1) {
        return t.getArtist().compareTo(t1.getArtist());
    }
    
}
