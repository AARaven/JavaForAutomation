package InheritanceAndPolymorphism.CircleAndCylinder;

class Circle {

    static final double DEFAULT_RADIUS = 5.0;
    static final double PI = Math.PI;
    protected double radius;
    protected Colour colour;

    protected enum Colour {
        BLACK("Black colour"), RED("Red colour"), YELLOW("Yellow colour"), DEFAULT("Default colour"),
        WHITE("White colour"), GREEN("Green colour"), PURPLE("Purple colour"), ORANGE("Orange colour");

        protected String choiceColour;

        Colour(String colour) {
            this.choiceColour = colour;
        }

        protected String getChoiceColour() {
            return choiceColour;
        }

        protected void setChoiceColour(Colour colour) {
            this.choiceColour = colour.name();
        }
    }

    Circle() {
        this.radius = DEFAULT_RADIUS;
        this.colour = Colour.DEFAULT;
    }

    Circle(double radius) {
        this.radius = radius;
        this.colour = Colour.DEFAULT;
    }

    Circle(double radius, Colour colour) {
        this.radius = radius;
        this.colour = Colour.valueOf(colour.name());
    }

    protected double getRadius() {
        return radius;
    }

    protected double getArea() {
        return (PI * (Math.pow(this.getRadius(), 2)));
    }

    protected String getColour() {
        return this.colour.getChoiceColour();
    }

    protected void setRadius(double radius) {
        this.radius = radius;
    }

    protected void setColour(Colour colour) {
        this.colour.choiceColour = colour.choiceColour;
    }

    @Override
    public String toString() {
        return String.format("\n" + "The radius of circle is : %.1f" + "\n" + "The colour of circle is : %s" +
                "\n" + "The area of circle is : %.1f" + "\n", radius, colour.choiceColour, getArea());
    }
}
