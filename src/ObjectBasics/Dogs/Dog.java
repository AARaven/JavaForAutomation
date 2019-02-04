package ObjectBasics.Dogs;

import java.util.*;

public class Dog implements Comparable < Dog > {
    
    private int    age;
    private String name;
    private Size   size;
    private Dog[]  dogs;
    
    private String[] getNames() {
        return names;
    }
    
    private void setNames( String[] names ) {
        this.names = names;
    }
    
    private String[] names = {
            "Abby", "Buddy", "Charlie",
            "Chloe", "Cody", "Max",
            "Molly", "Rex", "Riley",
            "Sully", };
    
    private enum Size {
        LOW( "Low" ), MIDDLE( "Middle" ),
        HIGH( "High" ), DEFAULT( "Default" ),
        ;
        
        private String size;
        
        Size( String size ) {
            this.size = size;
        }
        
        public static Size generateSize() {
            String[] sizes  = { "LOW", "MIDDLE", "HIGH" };
            int      random = ( int ) ( Math.random() * 10 );
            int index = ( random >= 0 && random <= 2 )
                        ? random
                        : 1;
            
            String size = sizes[ index ];
            
            return Size.valueOf( size );
        }
        
        public String getSize() {
            return this.size;
        }
    }
    
    private int getAge() {
        return this.age;
    }
    
    private void setAge( int age ) {
        this.age = age;
    }
    
    private String getName() {
        return this.name;
    }
    
    private void setName( String name ) {
        this.name = name;
    }
    
    private Size getSize() {
        return this.size;
    }
    
    private void setSize( Size size ) {
        this.size = size;
    }
    
    private Dog( String name, int age, String size ) {
        this.setName( ( name.isEmpty() )
                      ? nameGenerator()
                      : name );
        
        this.setAge( ( age >= 0 && age <= 20 )
                     ? age
                     : ageGenerator() );
        
        this.setSize( ( size.isEmpty() )
                      ? Size.generateSize()
                      : Size.valueOf( size.toUpperCase() ) );
    }
    
    private String nameGenerator() {
        int random = ( int ) ( Math.random() * 10 );
        int index  = ( random >= 0 && random <= 9 ) ? random : 5;
        return this.names[ index ];
    }
    
    private int ageGenerator() {
        int random = new Random().nextInt( 21 );
        int index  = ( random > 0 && random <= 20 ) ? random : 15;
        return index;
    }
    
    Dog() {
        this.setSize( Size.generateSize() );
        this.setAge( ageGenerator() );
        this.setName( nameGenerator() );
    }
    
    Dog[] getDogs() {
        return this.dogs;
    }
    
    void setDogs( Dog[] dogs ) {
        this.dogs = dogs;
    }
    
    Dog[] dogsGenerator( int capacity ) {
        Dog[] temp = new Dog[ capacity ];
        for ( int i = 0; i < capacity; i++ ) {
            temp[ i ] = new Dog();
        }
        return temp;
    }
    
    Dog[] dogsCreator( Scanner scanner ) {
        
        System.out.println( "Enter the number of dogs: " );
        Dog[] temp = new Dog[ Integer.parseInt( scanner.nextLine() ) ];
        
        for ( int i = 0; i < temp.length; i++ ) {
            
            System.out.print( "\nEnter the name of dog : " );
            String scanName = scanner.nextLine();
            
            System.out.print( "\nEnter the size of dog : " );
            String scanSize = scanner.nextLine();
            
            System.out.print( "\nEnter the age of dog : " );
            String tempAge = scanner.nextLine();
            
            int scanAge = tempAge.isEmpty()
                          ? 21
                          : Integer.parseInt( tempAge );
            
            temp[ i ] = new Dog( scanName, scanAge, scanSize );
        }
        return temp;
    }
    
    void sortByAge( Dog[] dogs, String ordering ) {
        switch ( ordering ) {
            case ( "natural" ):
                Arrays.sort( dogs, Comparator.comparingInt( Dog::getAge ) );
                break;
            
            case ( "reverse" ):
                Arrays.sort( dogs, Comparator.comparingInt( Dog::getAge ).reversed() );
                break;
            
            default:
                Arrays.sort( dogs, Comparator.comparingInt( Dog::getAge ) );
        }
    }
    
    void sortBySize( Dog[] dogs, String ordering ) {
        switch ( ordering ) {
            case ( "natural" ):
                Arrays.sort( dogs, Comparator.comparing( Dog::getSize ) );
                break;
            
            case ( "reverse" ):
                Arrays.sort( dogs, Comparator.comparing( Dog::getSize ).reversed() );
                break;
            
            default:
                Arrays.sort( dogs, Comparator.comparing( Dog::getSize ) );
        }
    }
    
    void sortByName( Dog[] dogs, String ordering ) {
        switch ( ordering ) {
            case ( "natural" ):
                Arrays.sort( dogs, Comparator.comparing( Dog::getName ) );
                break;
            
            case ( "reverse" ):
                Arrays.sort( dogs, Comparator.comparing( Dog::getName ).reversed() );
                break;
            
            default:
                Arrays.sort( dogs, Comparator.comparing( Dog::getName ) );
        }
    }
    
    void printDogs( Dog[] dogs ) {
        for ( Dog d : dogs ) {
            System.out.println( d );
        }
    }
    
    @Override
    public int compareTo( Dog dog ) {
        return String.CASE_INSENSITIVE_ORDER.compare( this.name, dog.name );
    }
    
    @Override
    public boolean equals( Object object ) {
        
        if ( object == this ) {
            return true;
        }
        
        if ( !( object instanceof Dog ) ) {
            return false;
        }
        
        Dog dog = ( Dog ) object;
        return this.getName().equals( dog.getName() )
               && this.getSize().equals( dog.getSize() )
               && this.getAge() == dog.getAge();
    }
    
    @Override
    public int hashCode() {
        return Objects.hash( this.getName(),
                             this.getSize(),
                             this.getAge() );
    }
    
    @Override
    public String toString() {
        return String.format( " { Name: %-8s}  |  { Size: %-7s}  |  { Age:%-3d} ",
                              this.getName(),
                              this.getSize().getSize(),
                              this.getAge() );
    }
}




