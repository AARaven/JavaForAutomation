package InheritanceAndPolymorphism.Shapes;

import InheritanceAndPolymorphism.CircleAndCylinder.Colour;

public class DemoClass {
    
    public static void main( String[] args ) {
        
        Shape[] shapes = new Shape[]{
                new Rectangle( 2, 4 ),
                new Circle( 5, Colour.PURPLE, true ),
                new Square( 4 ) };
        
        for ( Shape s : shapes ) {
            
            if ( s instanceof Circle ) {
                
                System.out.println( s );
                System.out.printf( "Area : %.2f\n\n", ( ( Circle ) s ).getArea() );
                
            } else if ( s instanceof Rectangle ) {
                
                System.out.println( s );
                System.out.printf( "Perimeter : %.2f\n\n", ( ( Rectangle ) s ).getPerimeter() );
                
            } else {
                
                System.out.println( s );
                System.out.printf( "Perimeter : %.2f\n\n", ( ( Square ) s ).getPerimeter() );
                
            }
        }
    }
}