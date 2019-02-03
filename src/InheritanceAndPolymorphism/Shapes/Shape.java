package InheritanceAndPolymorphism.Shapes;

import InheritanceAndPolymorphism.CircleAndCylinder.Colour;

class Shape {
    
    protected boolean filled;
    protected Colour colour;
    
    protected boolean isFilled() {
        return this.filled;
    }
    
    protected void setFilled( boolean filled ) {
        this.filled = filled;
    }
    
    protected Colour getColour() {
        return this.colour;
    }
    
    protected void setColour( Colour colour ) {
        this.colour = colour;
    }
    
    Shape() {
        this.setColour( Colour.DEFAULT );
        this.setFilled( false );
    }
    
    @Override
    public String toString() {
        return String.format( "Shape with the colour of %s and %b",
                this.colour,
                this.filled )
                .replaceAll( "true", "filled." )
                .replaceAll( "false", "not filled." );
    }
}
