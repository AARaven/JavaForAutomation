package InheritanceAndPolymorphism.CircleAndCylinder;

class Cylinder extends Circle {

    private static final double DEFAULT_HEIGHT = 5.0;
    private double height;

    Cylinder() {
        this.radius = DEFAULT_RADIUS;
        this.height = DEFAULT_HEIGHT;
        this.colour = Colour.DEFAULT;
    }

    Cylinder(double radius) {
        this.radius = radius;
        this.height = DEFAULT_HEIGHT;
    }

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.colour = Colour.DEFAULT;
    }

    Cylinder(double radius, double height, Colour colour) {
        this.radius = radius;
        this.height = height;
        this.colour = Colour.valueOf(colour.name());
    }

    private double getHeight() {
        return this.height;
    }

    private double getVolume() {
        return (((2 * PI * this.getRadius() * this.getHeight()) + 2 * super.getArea()));
    }

    @Override
    protected double getRadius() {
        return this.radius;
    }

    @Override
    protected String getColour() {
        return this.colour.getChoiceColour();
    }

    protected void setHeight(double height) {
        this.height = height;
    }

    @Override
    protected void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    protected void setColour(Colour colour) {
        this.colour.choiceColour = colour.choiceColour;
    }

    @Override
    protected double getArea() {
        return (2 * PI * this.getRadius() * this.getHeight());
    }

    @Override
    public String toString() {
        return String.format("\n" + "The base-radius of cylinder is : %.1f" + "\n"
                        + "The height of cylinder is : %.1f" + "\n"
                        + "The colour of cylinder is : %s" + "\n"
                        + "The surface-area of cylinder is : %.1f" + "\n"
                        + "The volume of cylinder is : %.1f" + "\n"
                , this.getRadius(), this.getHeight(), this.getColour(), this.getArea(), this.getVolume());
    }
}
