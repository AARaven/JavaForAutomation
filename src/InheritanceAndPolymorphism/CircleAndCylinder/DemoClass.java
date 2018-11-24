package InheritanceAndPolymorphism.CircleAndCylinder;

public class DemoClass {

    public static void main(String[] args) {

        System.out.print("\n"+"The demo_class"+"\n");

        Circle circle = new Circle();
        System.out.print(circle.toString());

        Circle circle1 = new Circle(2);
        System.out.print(circle1.toString());

        Circle circle2 = new Circle(7, Circle.Colour.YELLOW);
        System.out.print(circle2.toString());

        Cylinder cylinder = new Cylinder();
        System.out.print(cylinder.toString());

        Cylinder cylinder1 = new Cylinder(3);
        System.out.print(cylinder1.toString());

        Cylinder cylinder2 = new Cylinder(6,4);
        System.out.print(cylinder2.toString());

        Cylinder cylinder3 = new Cylinder(2,5, Cylinder.Colour.PURPLE);
        System.out.print(cylinder3.toString());
    }
}
