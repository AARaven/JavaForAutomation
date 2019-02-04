package InnerAndAbstractClassesAndInterfaces.MovableInterface;

public class MovableRectangleDemo {
    
    public static void main( String[] args ) {
        
        MovableRectangle movableRect =
                new MovableRectangle( new MovablePoint( 1, 2 ),
                                      new MovablePoint( 1, 4 ) );
        
        System.out.println( movableRect );
        
        movableRect.moveDown();
        movableRect.moveUp();
        movableRect.moveLeft();
        movableRect.moveLeft();
        movableRect.moveDown();
        movableRect.moveRight();
        movableRect.moveUp();
    }
}
