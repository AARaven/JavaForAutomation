package InnerAndAbstractClassesAndInterfaces.AbstractShapes;

abstract class Shape {

    abstract double getArea();

    abstract double getPerimeter();
    
    abstract boolean isInside(double x,double y);
}
