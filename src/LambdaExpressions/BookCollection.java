package LambdaExpressions;

import ObjectBasics.AuthorAndBook.Author;
import ObjectBasics.AuthorAndBook.Book;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class BookCollection {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        Author eckel = new Author("Bruce", "Eckel");
        Book thinkingJava = new Book("'Thinking in Java'",
                eckel, 37.00);
        books.add(thinkingJava);

        Book thinkingCpp = new Book("'Thinking in C++'",
                eckel, 37.90);
        books.add(thinkingCpp);

        Author siera = new Author("Kathy", "Sierra");
        Book headsFirstJava = new Book("'Heads First Java 2nd Edition'",
                siera, 34.50);
        books.add(headsFirstJava);

        Author bloch = new Author("Josh", "Bloch");
        Book effectiveJava = new Book("'Effective Java: Programming Language Guide'",
                bloch, 39.90);
        books.add(effectiveJava);

        Author fowler = new Author("Martin", "Fowler");
        Book refactoring = new Book("'Refactoring: Improving the Design of Existing Code'",
                fowler, 36.50);
        books.add(refactoring);

        books.stream()
                .max(Comparator.comparing(Book::getPrice))
                .get().getBookDetails();

        String authorTitleBook = books.stream()
                .filter(book -> book.getAuthor().equals(eckel))
                .map(Book::getTitle)
                .collect(Collectors.joining(" "));

        System.out.println(authorTitleBook+"\n");

        books.stream()
                .sorted(Comparator.comparing(book -> book.getAuthor().getAuthorFullName()))
                .distinct().map(book -> book.getAuthor().getAuthorFullName().concat(" ").concat(book.getTitle()))
                .forEach(System.out::println);

        double price = books.stream().mapToDouble(Book::getPrice).sum();
        System.out.print("\n" + String.format("TOTAL : %10.2f", price));
    }
}
