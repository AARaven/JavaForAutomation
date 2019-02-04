package LambdaExpressions;

import ObjectBasics.AuthorAndBook.Author;
import ObjectBasics.AuthorAndBook.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class BookCollection {
    
    public static void main( String[] args ) {
        
        ArrayList < Book > books = new ArrayList <>();
        
        Author eckel  = new Author( "Bruce", "Eckel" );
        Author sierra = new Author( "Kathy", "Sierra" );
        Author bloch  = new Author( "Josh", "Bloch" );
        Author fowler = new Author( "Martin", "Fowler" );
        
        Book thinkingJava = new Book( "'Thinking in Java'",
                                      eckel, 37.00 );
        
        Book thinkingCpp = new Book( "'Thinking in C++'",
                                     eckel, 37.90 );
        
        Book headsFirstJava = new Book( "'Heads First Java 2nd Edition'",
                                        sierra, 34.50 );
        
        Book effectiveJava = new Book( "'Effective Java: Programming Language Guide'",
                                       bloch, 39.90 );
        
        Book refactoring = new Book( "'Refactoring: Improving the Design of Existing Code'",
                                     fowler, 36.50 );
        
        books.addAll( Arrays.asList( thinkingJava, thinkingCpp,
                                     headsFirstJava, effectiveJava,
                                     refactoring ) );
        
        books.stream()
             .max( Comparator.comparing( Book::getPrice ) )
             .ifPresent( Book::getBookDetails );
        
        String titles = books.stream()
                             .filter( book -> book.getAuthor().equals( eckel ) )
                             .map( Book::getTitle )
                             .collect( Collectors.joining( "," ) );
        
        System.out.printf( "\n%s books : %s" +
                           "\n" +
                           "\n", eckel, titles );
        
        books.stream()
             .sorted( Comparator.comparing( book -> book.getAuthor().toString() ) )
             .distinct()
             .map( book -> book.getAuthor().toString().concat( " " ).concat( book.getTitle() ) )
             .forEachOrdered( System.out::println );
        
        double sumPrices = books.stream()
                                .mapToDouble( Book::getPrice )
                                .sum();
        
        System.out.printf( "\nTOTAL : { %.2f }" +
                           "\n", sumPrices );
    }
}
