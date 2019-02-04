package Collections;

import java.util.*;

public class CollectionsTest {
    
    private static < T extends Collection > void fillCollection( T collection, int bound ) {
        for ( int i = 0; i < bound; i++ ) {
            collection.add( new Person() );
        }
    }
    
    private static < T extends Map > void fillMap( T map, int bound ) {
        for ( int i = 0; i < bound; i++ ) {
            map.put( new Random().nextInt( 100 ), new Person() );
        }
    }
    
    public static void main( String[] args ) {
        
        //List:
        
        ArrayList < Person > arrayList = new ArrayList <>();
        fillCollection( arrayList, 5 );
        System.out.printf( "\nArrayList : %s " +
                           "\n", arrayList );
        
        Vector < Person > vector = new Vector <>();
        fillCollection( vector, 5 );
        System.out.printf( "\nVector : %s " +
                           "\n", vector );
        
        //Deque:
        ArrayDeque < Person > arrayDeque = new ArrayDeque <>();
        fillCollection( arrayDeque, 5 );
        System.out.printf( "\nArrayDeque : %s " +
                           "\n", arrayDeque );
        
        
        //List&&Deque :
        LinkedList < Person > linkedList = new LinkedList <>();
        fillCollection( linkedList, 5 );
        System.out.printf( "\nLinkedList : %s " +
                           "\n", linkedList );
        
        //Set:
        
        HashSet < Person > hashSet = new HashSet <>();
        fillCollection( hashSet, 5 );
        System.out.printf( "\nHashSet : %s " +
                           "\n", hashSet );
        
        LinkedHashSet < Person > linkedHashSet = new LinkedHashSet <>();
        fillCollection( linkedHashSet, 5 );
        System.out.printf( "\nLinkedHashSet : %s " +
                           "\n", linkedHashSet );
        
        
        //Navigable set:
        TreeSet < Person > treeSet = new TreeSet <>();
        fillCollection( treeSet, 5 );
        System.out.printf( "\nTreeSet : %s " +
                           "\n", treeSet );
        
        //Map:
        
        HashMap < Integer, Person > hashMap = new HashMap <>();
        fillMap( hashMap, 5 );
        System.out.printf( "\nHashMap : %s " +
                           "\n", hashMap );
        
        LinkedHashMap < Integer, Person > linkedHashMap = new LinkedHashMap <>();
        fillMap( linkedHashMap, 5 );
        System.out.printf( "\nLinkedHashMap : %s " +
                           "\n", linkedHashMap );
        
        //Navigable map:
        TreeMap < Integer, Person > treeMap = new TreeMap <>();
        fillMap( treeMap, 5 );
        System.out.printf( "\nTreeMap : %s " +
                           "\n", treeMap );
        
        
    }
}
