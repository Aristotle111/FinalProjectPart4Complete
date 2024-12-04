/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectpart4complete;
import static finalprojectpart4complete.Book.toTitleCase;
import java.util.ArrayList;
/**
 *
 * @author 6312971
 */
public class Library {
    
    public static void main(String[] args) {
        ArrayList<Book> b = new ArrayList<Book>();
        b.add(new Book("Sigma", "Kai Ceenat", 4.46, "AMP", "978-1-56619-909-4"));
        b.add(new Book("Eating", "Fanum", 4.46, "AMP", "978-1-56619-909-4"));
        b.add(new Book("Rizz", "Duke Dennis", 4.46, "AMP??", "978-1-56619-909-4"));
        Library a = new Library(b);
        System.out.println(a.toString());
    }
    
    private ArrayList<Book> books = new ArrayList<>(5);
    
    public Library(){
    }
    
    public Library(ArrayList<Book> books) {
        this.books = books;
    }
    
    public Library(Library library) {
        this.books = library.books;
    }
    
    public ArrayList<Book> searchBook(String keyword) {
        ArrayList<Book> keyBooks = new ArrayList<>();
        
        for(Book book : this.books) {
            if(book.getAuthor().contains(keyword) || book.getAuthor().contains(keyword)) {
                keyBooks.add(book);
            }         
        }
        return keyBooks;
    }
    
    public boolean equals(Library anotherLibrary) { 
        for(Book libraryBook : this.books) {
            boolean contains = true;
            for(Book anotherLibraryBook : anotherLibrary.books) {
                if(libraryBook.equals(anotherLibraryBook)) {
                    contains = true;
                    break;
                }
            }
            if(!contains) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public String toString() {
        String s = "";
        for(Book book : this.books) {
            s += (book.toString() + "\n");
        }
        return s;
    }
    
    public ArrayList<Book> getBooks() {
        return this.books;
    } 
    
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    } 
}
