package InheritanceAndPolymorphism.CircleAndCylinder;

public enum Colour {
    BLACK( "Black colour" ),
    RED( "Red colour" ),
    YELLOW( "Yellow colour" ),
    DEFAULT( "Default colour" ),
    WHITE( "White colour" ),
    GREEN( "Green colour" ),
    PURPLE( "Purple colour" ),
    ORANGE( "Orange colour" ),
    ;
    
    private String description;
    
    Colour( String color ) {
        this.description = color;
    }
    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription( String colour ) {
        this.description = colour;
    }
}