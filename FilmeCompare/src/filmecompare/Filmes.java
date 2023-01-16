
package filmecompare;

public class Filmes implements Comparable<Filmes>{
    private String titulo;
    private String ano;
    
    public Filmes(String t, String a){
        this.titulo = t;
        this.ano = a;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAno() {
        return ano;
    }

    @Override
    public String toString() {
        return "ano:" + ano +"\ttitulo: " + titulo + "\n";
    }

    @Override
    public int compareTo(Filmes t) {
        return getTitulo().compareTo(t.getTitulo());
    }
    
    
}
