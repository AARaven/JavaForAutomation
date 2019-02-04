package Generics;

public class Pair< T1, T2 > {
    
    private T1 t1;
    private T2 t2;
    
    private T1 getFirst() {
        return this.t1;
    }
    
    private T2 getSecond() {
        return this.t2;
    }
    
    private void setT1( T1 t1 ) {
        this.t1 = t1;
    }
    
    private void setT2( T2 t2 ) {
        this.t2 = t2;
    }
    
    private Pair( T1 t1, T2 t2 ) {
        this.setT1( t1 );
        this.setT2( t2 );
    }
    
    public static void main( String[] args ) {
        
        Pair < Integer, String > pair = new Pair <>( 20, "Circle" );
        
        Integer value = pair.getFirst();
        String  name  = pair.getSecond();
        
        System.out.printf(
                "\nFirst : %d  " +
                "\nSecond : %s" +
                "\n", value, name );
    }
}
