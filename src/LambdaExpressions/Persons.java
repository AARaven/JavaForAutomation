package LambdaExpressions;

import Collections.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Persons {
    
    public static void main( String[] args ) {
        
        ArrayList <Person> persons = new ArrayList <>();
        
        for ( int i = 0; i < 20; i++ ) {
            persons.add( new Person() );
        }
        
        System.out.println( "Person list : \n" );
        
        for ( Person p : persons ) {
            System.out.println( p );
        }
        
        
        ArrayList <String> pers = persons.stream()
                .filter( p -> ( 20 < p.getAge() ) && ( p.getAge() < 30 ) )
                .map( Person::getName )
                .map( String::toUpperCase )
                .distinct()
                .sorted( Comparator.comparing( String::length ) )
                .collect( Collectors.toCollection( ArrayList::new ) );
        
        System.out.printf( "\nThe stream : \n%s.\n", pers );
        
    }
}
