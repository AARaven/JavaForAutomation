package InheritanceAndPolymorphism.CircleAndCylinder;

public class DemoClass {

    public static void main(String[] args) {
        
        Circle circle = new Circle();
        System.out.print(circle);

        Circle circle1 = new Circle(2);
        System.out.print(circle1);

        Circle circle2 = new Circle(7, Colour.ORANGE);
        System.out.print(circle2);

        Cylinder cylinder = new Cylinder();
        System.out.print(cylinder);

        Cylinder cylinder1 = new Cylinder(3);
        System.out.print(cylinder1);

        Cylinder cylinder2 = new Cylinder(6, 4);
        System.out.print(cylinder2);

        Cylinder cylinder3 = new Cylinder(2, 5, Colour.PURPLE);
        System.out.print(cylinder3);
    }
}
