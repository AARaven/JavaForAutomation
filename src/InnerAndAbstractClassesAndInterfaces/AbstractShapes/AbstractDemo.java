package InnerAndAbstractClassesAndInterfaces.AbstractShapes;

public class AbstractDemo {

    public static void main(String[] args) throws Exception {

        Circle circle = new Circle(4);
        Rectangle rect = new Rectangle(4, 2);
        Square square = new Square(5.0);

        System.out.printf("The area of circle is %.1f.\n", circle.getArea());
        System.out.printf("The area of rectangle is %.1f.\n", rect.getArea());
        System.out.printf("The area of rectangle is %.1f.\n", square.getArea());

        System.out.printf("\nThe perimeter of rectangle is %.1f.\n", rect.getPerimeter());
        System.out.printf("The perimeter of square is %.1f.\n", square.getPerimeter());

        System.out.print(String.format("The point with coordinate x: %.1f and y: %.1f is %s\n"
                , 2.5, 4.8, circle.isInside(2.5, 4.8))
                .replaceAll("true", "inside of shape.")
                .replaceAll("false", "outside of shape."));

        System.out.print(String.format("The point with coordinate x: %.1f and y: %.1f is %s\n"
                , 2.0, -3.0, rect.isInside(2.0, -3.0))
                .replaceAll("true", "inside of shape.")
                .replaceAll("false", "outside of shape."));

        System.out.print(String.format("The point with coordinate x: %.1f and y: %.1f is %s\n"
                , 2.5, 2.5, square.isInside(2.5, 2.5))
                .replaceAll("true", "inside of shape.")
                .replaceAll("false", "outside of shape."));
    }
}
