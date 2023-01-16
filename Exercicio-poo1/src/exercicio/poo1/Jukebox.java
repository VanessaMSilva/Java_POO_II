package exercicio.poo1;
import java.util.*;
import java.io.*;

public class Jukebox {

   public ArrayList<Song> songList = new ArrayList<Song>();

   public void go() {
      getSongs();
      System.out.println( songList );
      Collections.sort( songList );
      System.out.println( songList );
      
      ArtistCompare artistCompare = new ArtistCompare();
      Collections.sort(songList,artistCompare);
      System.out.println( songList );
      /*
      HashSet<Song> songSet  = new HashSet<>();
      songSet.addAll(songList);
      System.out.println(songSet);
      */
      
      TreeSet<Song> songSet = new TreeSet<Song>();
      songSet.addAll(songList);
      System.out.println(songSet);
   }

   public void getSongs() {
      try {
         File file = new File( "SongList.txt" );
         BufferedReader reader = new BufferedReader( new FileReader( file ) );
         String line = null;
         while ( (line = reader.readLine() ) != null ) 
            addSong( line );
         reader.close();
      } catch ( Exception ex ) {
         ex.printStackTrace();
      }
   }

   public void addSong( String lineToParse ) {
      String[] tokens = lineToParse.split( "/" );

      Song nextSong = new Song( tokens[0], tokens[1], tokens[2], tokens[3], tokens[4] );
      songList.add( nextSong );
   }
}
