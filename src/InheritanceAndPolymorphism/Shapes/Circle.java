package InheritanceAndPolymorphism.Shapes;

class Circle extends Shape {

    private double radius;
    private static final double DEFAULT_RADIUS =1.0;

    protected Circle() {
        this.radius = DEFAULT_RADIUS;
        this.colour = DEFAULT_COLOUR;
        this.filled = DEFAULT_FILLED;
    }

    protected Circle(double radius) {
        this.radius = radius;
        this.filled = DEFAULT_FILLED;
        this.colour = DEFAULT_COLOUR;
    }

    protected Circle(double radius, String colour, boolean filled) {
        this.radius = radius;
        this.colour = colour;
        this.filled = filled;
    }

    private double getRadius() {
        return this.radius;
    }

    private String getColour() {
        return this.colour;
    }

    private boolean isFilled() {
        return this.filled;
    }

    private void setRadius(double radius) {
        this.radius = radius;
    }

    private void setColour(String colour) {
        this.colour = colour;
    }

    private void setFilled(boolean filled) {
        this.filled = filled;
    }

    protected double getArea() {
        return (PI * (Math.pow(this.getRadius(), 2)));
    }

    @Override
    public String toString() {
        return String.format("A Circle with radius = %.1f , which is a subclass of %s"
                , this.getRadius(), super.toString());
    }
}
