package LambdaExpressions;

import Collections.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Persons {
    
    public static void main( String[] args ) {
        
        ArrayList < Person > persons = new ArrayList <>();
        
        for ( int i = 0; i < 15; i++ ) {
            persons.add( new Person() );
        }
        
        System.out.println( "Person list :\n" );
        persons.forEach( person -> System.out.printf( "{%2d Person : %-9s}" +
                                                      "\n", persons.indexOf( person ) + 1,
                                                      person ) );
        
        ArrayList < String > sortedPerson
                = persons.stream()
                         .filter( p -> ( ( 20 < p.getAge() ) && ( p.getAge() < 30 ) ) )
                         .map( Person::getName ).map( String::toUpperCase )
                         .distinct()
                         .sorted( Comparator.comparing( String::length ) )
                         .collect( Collectors.toCollection(
                                 ArrayList::new ) );
        
        System.out.println( "\nAfter sort : \n" );
        sortedPerson.forEach
                ( person -> System.out.printf( "{%2d Person : %-6s}\n",
                                               sortedPerson.indexOf( person ) + 1, person ) );
    }
}
