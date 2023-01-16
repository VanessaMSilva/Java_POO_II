package aula11.pkg10;

import java.util.ArrayList;
import java.util.Objects;

public class Song implements Comparable<Song> {

    private String title;
    private String artist;
    private String rating;
    private int bpm;
    

    Song(String t, String a, String r, int b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
    }

    public String getTitle() {
        return title;
    }
    // mais getters

    public String toString() {
        return title;
    }

    public int getBpm() {
        return bpm;
    }


    public int compareTo(Song s) {
        return this.bpm - s.bpm;
        //return this.bpm > s.bpm ? 1 : this.bpm == s.bpm ? 0 : -1;
    }
    
    public boolean equals(Object o) {
    Song s = (Song) o;
    return getTitle().equals(s.getTitle());
  }

  public int hashCode() {
    return title.hashCode();
  }

    void compareTo(ArrayList<Song> songList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
