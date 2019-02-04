package InnerAndAbstractClassesAndInterfaces.AbstractShapes;

import java.util.Objects;

class Circle extends Shape {
    
    private static final double DEFAULT_RADIUS = 1.0;
    private static final int    DEFAULT_X      = 1;
    private static final int    DEFAULT_Y      = 1;
    
    private double x_coordinate;
    private double y_coordinate;
    private double radius;
    
    private double getX_coordinate() {
        return this.x_coordinate;
    }
    
    private double getY_coordinate() {
        return this.y_coordinate;
    }
    
    private void setX_coordinate( double x_coordinate ) {
        this.x_coordinate = x_coordinate;
    }
    
    private void setY_coordinate( double y_coordinate ) {
        this.y_coordinate = y_coordinate;
    }
    
    private double getRadius() {
        return this.radius;
    }
    
    private void setRadius( double radius ) {
        this.radius = radius;
    }
    
    Circle() {
        this.setRadius( DEFAULT_RADIUS );
        this.setX_coordinate( DEFAULT_X );
        this.setY_coordinate( DEFAULT_Y );
    }
    
    Circle( double radius ) {
        this.setRadius( radius );
        this.setX_coordinate( DEFAULT_X );
        this.setY_coordinate( DEFAULT_Y );
    }
    
    double getArea() {
        return ( Math.PI * ( Math.pow( this.getRadius(), 2 ) ) );
    }
    
    boolean isInside( double x, double y ) {
        return ( Math.pow( ( x - this.getX_coordinate() ), 2 ) +
                 ( Math.pow( ( y - this.getY_coordinate() ), 2 ) ) ) <= ( Math.pow(
                this.getRadius(), 2 ) );
    }
    
    @Override
    double getPerimeter() {
        return 2 * Math.PI * this.getRadius();
    }
    
    @Override
    public boolean equals( Object object ) {
        
        if ( this == object ) {
            return true;
        }
        
        if ( !( object instanceof Circle ) ) {
            return false;
        }
        
        Circle circle = ( Circle ) object;
        return this.getRadius() == circle.getRadius()
               && this.getX_coordinate() == circle.getX_coordinate()
               && this.getY_coordinate() == circle.getY_coordinate();
    }
    
    @Override
    public int hashCode() {
        return Objects.hash( this.getRadius(),
                             this.getX_coordinate(),
                             this.getY_coordinate() );
    }
    
    @Override
    public String toString() {
        return String.format( "A Circle with radius = %.1f , which is a subclass of %s"
                , this.getRadius(), super.toString() );
    }
}
