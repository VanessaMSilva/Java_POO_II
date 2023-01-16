
package exercicio.poo1;

import java.util.Objects;


public class Song implements Comparable<Song>{
   private String title;
   private String artist;
   private String rating;
   private String bpm;
   private String faixa;

   public Song( String t, String a, String r, String b, String faixa) {
      title = t;
      artist = a;
      rating = r;
      bpm = b;
      this.faixa = faixa;
   }

   public String getTitle() {
      return title;
   }
   // mais getters

   public String toString() {
      return "Faixa: " +getFaixa() +" "+ title + ": " + getArtist();
   }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getBpm() {
        return bpm;
    }

    public void setBpm(String bpm) {
        this.bpm = bpm;
    }
   
    @Override
    public int compareTo(Song t) {
        return faixa.compareTo(t.getFaixa());
    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    public String getFaixa() {
        return faixa;
    }
    

    @Override
    public boolean equals(Object obj) {
        Song s = (Song) obj;
        return getTitle().equals(s.getTitle());
    }
    
}

/*public class Song implements Comparable<Song>{
    String title;
    String artist;
    String rating;
    String bpm;
    
    Song(String t, String a, String r, String b){
        this.title = t;
        this.artist = a;
        this.rating = r;
        this.bpm = b;
    }
    
    public String getTitle(){
        return this.title;
    }
    
    public String toString(){
        return this.title;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public int compareTo(Song o) {
        return this.title.compareTo(o.getTitle());
    }
}*/
