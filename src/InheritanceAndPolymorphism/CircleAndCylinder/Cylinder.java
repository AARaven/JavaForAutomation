package InheritanceAndPolymorphism.CircleAndCylinder;

import java.util.Objects;

class Cylinder extends Circle {
    
    private static final double DEFAULT_HEIGHT = 5.0;
    
    private double height;
    
    private double getHeight() {
        return this.height;
    }
    
    private void setHeight( double height ) {
        this.height = height;
    }
    
    private double getVolume() {
        return ( ( ( 2 * Math.PI * this.getRadius() * this.getHeight() ) + 2 * super.getArea() ) );
    }
    
    Cylinder() {
        this.setRadius( DEFAULT_RADIUS );
        this.setHeight( DEFAULT_HEIGHT );
        this.setColour( Colour.DEFAULT );
    }
    
    Cylinder( double radius ) {
        this.setRadius( radius );
        this.setHeight( DEFAULT_HEIGHT );
        this.setColour( Colour.DEFAULT );
    }
    
    Cylinder( double radius, double height ) {
        super( radius );
        this.setHeight( height );
        this.setColour( Colour.DEFAULT );
    }
    
    Cylinder( double radius, double height, Colour colour ) {
        super( radius, colour );
        this.setHeight( height );
    }
    
    @Override
    protected double getRadius() {
        return this.radius;
    }
    
    @Override
    protected Colour getColour() {
        return this.colour;
    }
    
    @Override
    protected void setRadius( double radius ) {
        this.radius = radius;
    }
    
    @Override
    protected void setColour( Colour colour ) {
        this.colour = colour;
    }
    
    @Override
    protected double getArea() {
        return ( 2 * Math.PI * this.getRadius() * this.getHeight() );
    }
    
    @Override
    public boolean equals( Object object ) {
        if ( this == object ) {
            return true;
        }
        
        if ( !( object instanceof Cylinder ) ) {
            return false;
        }
        
        Cylinder cylinder = ( Cylinder ) object;
        return this.getHeight() == cylinder.getHeight()
                && this.getRadius() == cylinder.getRadius()
                && this.getColour() == cylinder.getColour();
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
                this.getRadius(),
                this.getHeight(),
                this.getColour() );
    }
    
    @Override
    public String toString() {
        return String.format( "\nThe base-radius of cylinder is : %.1f\n"
                        + "The height of cylinder is : %.1f\n"
                        + "The colour of cylinder is : %s\n"
                        + "The surface-area of cylinder is : %.1f\n"
                        + "The volume of cylinder is : %.1f\n",
                this.getRadius(),
                this.getHeight(),
                this.getColour().getDescription(),
                this.getArea(),
                this.getVolume() );
    }
}
