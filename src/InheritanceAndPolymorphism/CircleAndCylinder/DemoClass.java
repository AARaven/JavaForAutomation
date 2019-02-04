package InheritanceAndPolymorphism.CircleAndCylinder;

public class DemoClass {
    
    public static void main( String[] args ) {
        
        Circle circle  = new Circle();
        Circle circle1 = new Circle( 2 );
        Circle circle2 = new Circle( 7, Colour.ORANGE );
        
        System.out.print( circle );
        System.out.print( circle1 );
        System.out.print( circle2 );
        
        Cylinder cylinder  = new Cylinder();
        Cylinder cylinder1 = new Cylinder( 3 );
        Cylinder cylinder2 = new Cylinder( 6, 4 );
        Cylinder cylinder3 = new Cylinder( 2, 5, Colour.PURPLE );
        
        System.out.print( cylinder );
        System.out.print( cylinder1 );
        System.out.print( cylinder2 );
        System.out.print( cylinder3 );
    }
}
