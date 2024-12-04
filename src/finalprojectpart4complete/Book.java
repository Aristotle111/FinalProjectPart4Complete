/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finalprojectpart4complete;

/**
 *
 * @author 6312971
 */
public class Book {
    private String title;
    private String author;
    private double price;
    private String publisher;
    private String isbn;
    
    
    public Book() {
    }
    
    public Book(String title) {
        this.title = title;
    }
    
    public Book(String title, String author, double price, String publisher, String isbn) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
        this.isbn = isbn;
    }
    
    public Book(Book book) {
        this.title = book.title;
        this.author = book.author;
        this.price = book.price;
        this.publisher = book.publisher;
        this.isbn = book.isbn;
    }
    
    public int checkIsbnStatus(String isbn) {
        
        switch(isbn.length()) {
            case 13: return 0;
            case 17: return 1;  
        }
        return -1;
    }
    
    public static String toTitleCase(String string){
        boolean isSpace = true;
        String titleCaseString = "";
        
        for(int i = 0; i < string.length(); i ++) {
            char currentChar = string.charAt(i);
            
            if(currentChar == ' ') {
                titleCaseString += " ";
                isSpace = true;
                continue;
            }
            
            if(isSpace) {
                titleCaseString += Character.toUpperCase(currentChar);
                isSpace = false;
                continue;
            }
            
            titleCaseString += Character.toLowerCase(currentChar);
        }
        
        return titleCaseString;
    }
    
    @Override
    public String toString() {
        return "Title     : " + toTitleCase(this.title) + "\n" +
               "Author    : " + toTitleCase(this.author) + "\n" +
               "Price     : " + this.price + "\n" +
               "Publisher : " + this.publisher + "\n" +
               "ISBN      : " + this.isbn + "\n";
    }
    
    public boolean equals(Book anotherBook) {
        boolean isEqual = true;
        
        if(this.title.equals(anotherBook.title)) {
            isEqual = false;
        }
        if(this.author.equals(anotherBook.author)) {
            isEqual = false;
        }
        if(this.price == (anotherBook.price)) {
            isEqual = false;
        }
        if(this.publisher.equals(anotherBook.publisher)) {
            isEqual = false;
        }
        if(this.isbn.equals(anotherBook.isbn)) {
            isEqual = false;
        }
        
        return isEqual;
    }
    
    @Override
    public Book clone() {
        return new Book(this);
    }
    
    
    public String getTitle() {
        return this.title;
    }   
    public void setTitle(String title) {
        this.title = title;
    }
    
    
    public String getAuthor() {
        return this.author;
    }    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    
    public double getPrice() {
        return this.price;
    }   
    public void setPrice(double price) {
        this.price = price;
    }
    
    
    public String getPublisher() {
        return this.publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    
    public String getIsbn() {
        return this.isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
