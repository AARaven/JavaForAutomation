package Collections;

import java.util.*;

public class Person implements Comparable <Person> {
    
    private int age;
    private String name;
    private String[] names = { "Sid", "Joey", "Paul", "Chris", "Jim", "Craig", "Shawn", "Mick", "Corey" };
    
    public int getAge() {
        return this.age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public Person() {
        this.age = new Random().nextInt( 65 );
        if ( this.age < 21 ) {
            this.age = 21;
        }
        this.name = this.names[ new Random().nextInt( 9 ) ];
    }
    
    private Person( int age, String name ) {
        this.age = age;
        this.name = name;
    }
    
    private static List <Person> toUniqueList( List <Person> list ) {
        HashSet <Person> set = new HashSet <Person>( list );
        return new ArrayList <Person>( set );
    }
    
    private static boolean compareTwoLists( List <Person> list1, List <Person> list2 ) {
        if ( list1.size() == list2.size() ) {
            return list1.equals( list2 );
        }
        return false;
    }
    
    public static void fillList( List <Person> list, int bound ) {
        for ( int i = 0; i < bound; i++ ) {
            list.add( new Person() );
        }
    }
    
    private static void printList( List <Person> p ) {
        System.out.printf( "(List size : %d) \n\n", p.size() );
        
        for ( Person person : p ) {
            System.out.println( person );
        }
    }
    
    @Override
    public String toString() {
        return ( this.name + " " + this.age );
    }
    
    @Override
    public boolean equals( Object object ) {
        if ( this == object ) {
            return true;
        }
        
        if ( object == null || this.getClass() != object.getClass() ) {
            return false;
        }
        
        Person person = ( Person ) object;
        return this.name.equals( person.name )
                && this.age == person.age;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash( this.name, this.age );
    }
    
    @Override
    public int compareTo( Person person ) {
        return this.age - person.age;
    }
    
    public static void main( String[] args ) {
        
        List <Person> persons = new ArrayList <>();
        List <Person> uniqueList;
        
        fillList( persons, 25 );
        
        System.out.println( "ArrayList  : \n" );
        printList( persons );
        
        System.out.println( "\n" + "Sort without comparator : " + "\n" );
        Collections.sort( persons );
        printList( persons );
        
        System.out.println( "\n" + "With comparator : " + "\n" );
        persons.sort( Comparator.comparing( o2 -> o2.getName() ) );
        printList( persons );
        
        System.out.println( "\n" + "Unique method :" + "\n" );
        uniqueList = toUniqueList( persons );
        printList( uniqueList );
        
        System.out.println( "\n" + "Equals of Two : " + " " );
        System.out.printf( "The result of compare two lists is : %s \n",
                compareTwoLists( persons, uniqueList ) );
        
        System.out.printf( "Lists sizes is : %d | %d \n",
                persons.size(), uniqueList.size() );
        
        System.out.println( "\n" + "Sort array list now : " + "\n" );
        persons.sort( ( Comparator.comparing( o -> o.getName() ) ) );
        printList( persons );
    }
}
