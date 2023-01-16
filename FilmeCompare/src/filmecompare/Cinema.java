package filmecompare;

import java.io.*;
import java.util.ArrayList;
import java.util.*;

public class Cinema {
    ArrayList<Filmes> f = new ArrayList<Filmes>();
    
    void go(){
        getFilmes();
        System.out.println(f);
        Collections.sort(f);
        System.out.println(f);
        
        TreeSet<Filmes> treeFilmes = new TreeSet<>();
        treeFilmes.addAll(f);
        System.out.println(treeFilmes);
    }
    
    public void getFilmes(){
        try{
           File lista = new File("Filmes.txt");
           BufferedReader reader = new BufferedReader(new FileReader(lista));
           String line = null;
           while ( (line = reader.readLine() ) != null ) 
            addFilme( line );
           reader.close();
           
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void addFilme(String lineToParse){
        String [] itens = lineToParse.split("/");
        Filmes filmes = new Filmes(itens[0],itens[1]);
        f.add(filmes);
    }
    
}
