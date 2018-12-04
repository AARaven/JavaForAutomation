package InheritanceAndPolymorphism.Shapes;

class Shape {

    static final double PI = Math.PI;
    boolean filled;
    String colour;

    protected static final boolean DEFAULT_FILLED = true;
    protected boolean falseFilled = false;

    protected static final String DEFAULT_COLOUR = "green";
    protected String redColour = "red";

    Shape() {
        this.filled = DEFAULT_FILLED;
        this.colour = DEFAULT_COLOUR;
    }

    private Shape(boolean filled, String colour) {
        this.filled = filled;
        this.colour = colour;
    }

    private boolean isFilled() {
        return this.filled;
    }

    private String getColour() {
        return this.colour;
    }

    private void setFilled(boolean filled) {
        this.filled = filled;
    }

    private void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return String.format("\n" + "A Shape with the colour of %s and %b" + "\n"
                , this.colour, this.filled)
                .replaceAll("true", "filled.")
                .replaceAll("false", "not filled.");
    }
}
