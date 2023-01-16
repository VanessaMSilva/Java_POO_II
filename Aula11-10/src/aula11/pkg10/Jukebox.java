/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11.pkg10;

import java.util.*;
import java.io.*;

/**
 *
 * @author vanes
 */
public class Jukebox {

    ArrayList<Song> songList = new ArrayList<Song>();
    

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        
        TreeSet<Song> songSet = new TreeSet<Song>();
        //HashSet<Song> songSet = new HashSet<Song>(); //Retira as musicas iguais
        songSet.addAll(songList);
        System.out.println(songSet);
    }

    public void getSongs() {
        try {
            File file = new File("SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                addSong(line);
            }
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        int t = Integer.parseInt(tokens[3]);
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2], t);
        songList.add(nextSong);
    }
}
