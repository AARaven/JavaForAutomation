package ObjectBasics.AuthorAndBook;

import java.util.Objects;

public class Book {
    
    private double price;
    private String title;
    private Author author;
    
    private void setPrice( double price ) {
        this.price = price;
    }
    
    private void setTitle( String title ) {
        this.title = title;
    }
    
    private void setAuthor( Author author ) {
        this.author = author;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public Author getAuthor() {
        return this.author;
    }
    
    public double getPrice() {
        return this.price;
    }
    
    public void getBookDetails() {
        System.out.println( this );
    }
    
    public Book( String title, Author author, double price ) {
        this.setTitle( title );
        this.setAuthor( author );
        this.setPrice( price );
    }
    
    @Override
    public boolean equals( Object object ) {
        
        if ( this == object ) {
            return true;
        }
        
        if ( !( object instanceof Book ) ) {
            return false;
        }
        
        Book book = ( Book ) object;
        return this.getAuthor().equals( book.getAuthor() )
                && this.getTitle().equals( book.getTitle() )
                && this.getPrice() == book.getPrice();
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
                this.getAuthor(),
                this.getTitle(),
                this.getPrice() );
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
