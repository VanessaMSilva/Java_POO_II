/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtree;

/**
 *
 * @author vanes
 */
public class Book implements Comparable<Book>{
    String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Book{" + "title: " + title + '}';
    }
    

    /**
     *
     * @param t
     * @return
     */

    public int compareTo(Book t) {
        Book b = (Book) t;
        return getTitle().compareTo(t.getTitle());
    }
    
}
