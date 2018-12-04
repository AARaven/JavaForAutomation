package InheritanceAndPolymorphism.Shapes;

public class DemoClass {

    public static void iterateArrayShapes(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Circle) {
                System.out.print(shapes[i].toString());
                System.out.print("The my area is : " + ((Circle) shapes[i]).getArea() + "\n\n");
            } else if (shapes[i] instanceof Rectangle) {
                System.out.print(shapes[i].toString());
                System.out.print("The my perimeter is : " + ((Rectangle) shapes[i]).getPerimeter() + "\n\n");
            }
        }
    }

    public static void iterateForEachShapes(Shape[] shapes) {
        for (Shape s : shapes) {
            if (s instanceof Circle) {
                System.out.print(s.toString());
                System.out.print("The my area is : " +
                        ((Circle) s).getArea() + "\n\n");
            } else if (s instanceof Rectangle) {
                System.out.print(s.toString());
                System.out.print("The my perimeter is : " +
                        ((Rectangle) s).getPerimeter() + "\n\n");
            }
        }
    }

    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle();
        shapes[1] = new Circle();
        shapes[2] = new Square();

        iterateArrayShapes(shapes);
        iterateForEachShapes(shapes);
    }
}