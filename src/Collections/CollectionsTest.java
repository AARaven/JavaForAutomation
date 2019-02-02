package Collections;

import java.util.*;

public class CollectionsTest {
    
    private static void fillList( List<Person> list ,int bound) {
        for ( int i = 0; i < bound; i++ ) {
            list.add( new Person() );
        }
    }
    
    private static void fillQueue( Queue <Person> queue, int bound ) {
        for ( int i = 0; i < bound; i++ ) {
            queue.add( new Person() );
        }
    }
    
    private static void fillDeque( Deque <Person> deque, int bound ) {
        for ( int i = 0; i < bound; i++ ) {
            deque.add( new Person() );
        }
    }
    
    private static void fillSet( Set <Person> set, int bound ) {
        for ( int i = 0; i < bound; i++ ) {
            set.add( new Person() );
        }
    }
    
    private static void fillMap( Map <Integer, Person> map, int bound ) {
        for ( int i = 0; i < bound; i++ ) {
            map.put( new Person().getAge(), new Person() );
        }
    }
    
    private static void fillStack( Stack <Person> stack, int bound ) {
        for ( int i = 0; i < bound; i++ ) {
            stack.push( new Person() );
        }
    }
    
    private static void fillVector( Vector <Person> vector, int bound ) {
        for ( int i = 0; i < bound; i++ ) {
            vector.add( new Person() );
        }
    }
    
    public static void main( String[] args ) {
        
        ArrayList <Person> arrayList = new ArrayList <>();
        fillList( arrayList,5 );
        System.out.printf("This is an ArrayList : %s \n",arrayList);
    
    
        LinkedList <Person> linkedList = new LinkedList <>();
        fillList( linkedList,5 );
        System.out.printf("This is a LinkedList : %s \n",linkedList);
        
        ArrayDeque <Person> arrayDeque = new ArrayDeque <>();
        fillDeque( arrayDeque,5 );
        System.out.printf("This is a ArrayDeque : %s \n",arrayDeque);
        
        PriorityQueue <Person> priorityQueue = new PriorityQueue <>();
        fillQueue( priorityQueue,5 );
        System.out.printf("This is a PriorityDeque : %s \n",priorityQueue);
        
        Stack <Person> stack = new Stack <>();
        fillStack( stack,5 );
        System.out.printf("This is a Stack : %s \n",stack);
        
        Vector <Person> vector = new Vector <>();
        fillVector( vector, 5 );
        System.out.printf("This is a Vector : %s \n",vector);
        
        
        HashSet <Person> hashSet = new HashSet <>();
        fillSet( hashSet,5 );
        System.out.printf("This is a HashSet : %s \n",hashSet);
        
        TreeSet <Person> treeSet = new TreeSet <>();
        fillSet( treeSet, 5 );
        System.out.printf("This is a TreeSet : %s \n",treeSet);
        
        LinkedHashSet <Person> linkedHashSet = new LinkedHashSet <>();
        fillSet( linkedHashSet,5 );
        System.out.printf("This is a LinkedHashSet : %s \n",linkedHashSet);
        
        
        HashMap <Integer, Person> hashMap = new HashMap <>();
        fillMap( hashMap,5 );
        System.out.printf("This is a HashMap : %s \n",hashMap);
        
        TreeMap <Integer, Person> treeMap = new TreeMap <>();
        fillMap( treeMap,5 );
        System.out.printf("This is a TreeMap : %s \n",treeMap);
        
        LinkedHashMap <Integer, Person> linkedHashMap = new LinkedHashMap <>();
        fillMap( linkedHashMap,5 );
        System.out.printf("This is a LinkedHashMap : %s \n",linkedHashMap);
        
    }
}
