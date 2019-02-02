package ObjectBasics.AuthorAndBook;

import java.util.Objects;

public class Book {
    
    private double price;
    private String title;
    private Author author;
    
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice( double price ) {
        this.price = price;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle( String title ) {
        this.title = title;
    }
    
    public Author getAuthor() {
        return this.author;
    }
    
    public void setAuthor( Author author ) {
        this.author = author;
    }
    
    public void getBookDetails() {
        System.out.printf( "\nThe book title is : %s", this.getTitle() );
        System.out.printf( "\nThe book author is : %s", this.getAuthor() );
        System.out.printf( "\nThe book price is : %.2f", this.getPrice() );
    }
    
    public Book( String title, Author author, double price ) {
        this.setTitle( title );
        this.setAuthor( author );
        this.setPrice( price );
    }
    
    @Override
    public boolean equals( Object obj ) {
        
        if ( this == obj ) {
            return true;
        }
        
        if ( !( obj instanceof Book ) ) {
            return false;
        }
        
        Book book = ( Book ) obj;
        return this.getAuthor().equals( book.getAuthor() )
                && this.getTitle().equals( book.getTitle() )
                && this.getPrice() == book.getPrice();
    }
    
    @Override
    public int hashCode() {
        return Objects.hash( this.getAuthor(), this.getTitle(), this.getPrice() );
    }
    
    @Override
    public String toString() {
        return String.format( "The book title is : %s " +
                        "\nThe book author is : %s " +
                        "\nThe book price is : %.2f",
                this.getTitle(),
                this.getAuthor(),
                this.getPrice() );
    }
}
