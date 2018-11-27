package LambdaExpressions;

import ObjectBasics.AuthorAndBook.Author;
import ObjectBasics.AuthorAndBook.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class BookCollection {


    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        Author eckel = new Author("Bruce","Eckel");
        Book thinkingJava = new Book("Thinking in Java", eckel, 25.99);
        books.add(thinkingJava);

        Author siera = new Author("Kathy","Sierra");
        Book headsFirstJava = new Book("Heads First Java 2nd Edition", siera, 14.50);
        books.add(headsFirstJava);

        Author bloch = new Author("Josh", "Bloch");
        Book effectiveJava = new Book("Effective Java", bloch, 39.90);
        books.add(effectiveJava);

//        for (Book b : books) b.getBookDetails();

        books.stream()
                .max(Comparator.comparing(Book::getPrice))
                .get().getBookDetails();

        double price = books.stream().mapToDouble(Book::getPrice).sum();

        System.out.println(price);




    }
}
