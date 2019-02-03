package Generics;

public class GenericMethod {
    
    private static <T extends Comparable> boolean compareIt( T t1, T t2 ) {
        return t1.compareTo( t2 ) == 0;
    }
    
    public static void main( String[] args ) {
    
        String a = "A"; Character cha4 = 'g';   int eax = 25;
        String b = "B"; Character cha3 = 'f';   int ebx = 13;
        String c = "B"; Character cha2 = 'd';   int ecx = 25;
        String d = "A"; Character cha = 'f';    int edx = 24;
        
        System.out.printf( "\nString : { %s } and { %s } - %b\n", a, c, compareIt( a, b ) );
        System.out.printf( "String : { %s } and { %s } - %b\n", b, c, compareIt( b, c ) );
        System.out.printf( "String : { %s } and { %s } - %b\n", a, c, compareIt( a, c ) );
        System.out.printf( "String : { %s } and { %s } - %b\n", a, d, compareIt( a, d ) );
        
        System.out.printf( "\nCharacter : { %c } and { %c } - %b\n", cha, cha2, compareIt( cha, cha2 ) );
        System.out.printf( "Character : { %c } and { %c } - %b\n", cha2, cha3, compareIt( cha2, cha3 ) );
        System.out.printf( "Character : { %c } and { %c } - %b\n", cha3, cha, compareIt( cha3, cha ) );
        System.out.printf( "Character : { %c } and { %c } - %b\n", cha, cha4, compareIt( cha, cha4 ) );
        
        System.out.printf( "\nInteger : { %d } and { %d } - %b\n", eax, ebx, compareIt( eax, ebx ) );
        System.out.printf( "Integer : { %d } and { %d } - %b\n", ecx, eax, compareIt( ecx, eax ) );
        System.out.printf( "Integer : { %d } and { %d } - %b\n", edx, eax, compareIt( edx, eax ) );
        System.out.printf( "Integer : { %d } and { %d } - %b\n", ebx, edx, compareIt( ebx, edx ) );
    }
}
