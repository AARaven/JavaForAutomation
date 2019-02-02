package InnerAndAbstractClassesAndInterfaces.AbstractShapes;

import java.util.Objects;

class Circle extends Shape {
    
    private static final double DEFAULT_RADIUS = 1.0;
    private static final int DEFAULT_X = 1;
    private static final int DEFAULT_Y = 1;
    private double radius;
    private double x_coordinate;
    private double y_coordinate;
    
    private double getRadius() {
        return this.radius;
    }
    
    private void setRadius( double radius ) {
        this.radius = radius;
    }
    
    protected Circle() {
        this.radius = DEFAULT_RADIUS;
        this.x_coordinate = DEFAULT_X;
        this.y_coordinate = DEFAULT_Y;
    }
    
    protected Circle( double radius ) {
        this.radius = radius;
        this.x_coordinate = DEFAULT_X;
        this.y_coordinate = DEFAULT_Y;
    }
    
    double getArea() {
        return ( Math.PI * ( Math.pow( this.getRadius(), 2 ) ) );
    }
    
    boolean isInside( double x, double y ) {
        return ( Math.pow( ( x - this.x_coordinate ), 2 ) +
                ( Math.pow( ( y - this.y_coordinate ), 2 ) ) ) <= ( Math.pow( this.radius, 2 ) );
    }
    
    @Override
    void printLengthOfCircumference() {
        System.out.printf( "The length of circumference is : %.1f\n", ( 2 * Math.PI * this.radius ) );
    }
    
    @Override
    double getPerimeter() {
        return Double.parseDouble( "The circle has no perimeter!!!" );
    }
    
    @Override
    public boolean equals( Object obj ) {
        
        if ( this == obj ) {
            return true;
        }
        
        if ( !( obj instanceof Circle ) ) {
            return false;
        }
        
        Circle circle = ( Circle ) obj;
        return this.radius == circle.radius
                && this.x_coordinate == circle.x_coordinate
                && this.y_coordinate == circle.y_coordinate;
    }
    
    @Override
    public int hashCode() {
        return Objects.hash( this.radius, this.x_coordinate, this.y_coordinate );
    }
    
    @Override
    public String toString() {
        return String.format( "A Circle with radius = %.1f , which is a subclass of %s"
                , this.getRadius(), super.toString() );
    }
}
