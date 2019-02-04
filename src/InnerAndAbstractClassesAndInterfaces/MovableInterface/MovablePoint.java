package InnerAndAbstractClassesAndInterfaces.MovableInterface;

import java.util.Objects;

public class MovablePoint implements Movable {
    
    private static final int DEFAULT_X_SPEED = 1;
    private static final int DEFAULT_Y_SPEED = 1;
    
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    
    private void setXSpeed( int xSpeed ) {
        this.xSpeed = xSpeed;
    }
    
    private void setYSpeed( int ySpeed ) {
        this.ySpeed = ySpeed;
    }
    
    int getX() {
        return this.x;
    }
    
    void setX( int x ) {
        this.x = x;
    }
    
    int getY() {
        return this.y;
    }
    
    void setY( int y ) {
        this.y = y;
    }
    
    int getXSpeed() {
        return this.xSpeed;
    }
    
    int getYSpeed() {
        return this.ySpeed;
    }
    
    MovablePoint( int x, int y ) {
        this.setX( x );
        this.setY( y );
        
        this.setXSpeed( DEFAULT_X_SPEED );
        this.setYSpeed( DEFAULT_Y_SPEED );
    }
    
    MovablePoint( int x, int y, int xSpeed, int ySpeed ) {
        this.setX( x );
        this.setY( y );
        
        this.setXSpeed( xSpeed );
        this.setYSpeed( ySpeed );
    }
    
    @Override
    public void moveUp() {
        this.setY( this.getY() + this.getYSpeed() );
    }
    
    @Override
    public void moveDown() {
        this.setY( this.getY() - this.getYSpeed() );
    }
    
    @Override
    public void moveRight() {
        this.setX( this.getX() + this.getXSpeed() );
    }
    
    @Override
    public void moveLeft() {
        this.setX( this.getX() - this.getXSpeed() );
    }
    
    @Override
    public boolean equals( Object object ) {
        
        if ( this == object ) {
            return true;
        }
        
        if ( !( object instanceof MovablePoint ) ) {
            return false;
        }
        
        MovablePoint point = ( MovablePoint ) object;
        return this.getX() == point.getX()
               && this.getY() == point.getY()
               && this.getXSpeed() == point.getXSpeed()
               && this.getYSpeed() == point.getYSpeed();
    }
    
    @Override
    public int hashCode() {
        return Objects.hash( this.getX(),
                             this.getY(),
                             this.getXSpeed(),
                             this.getYSpeed() );
    }
    
    @Override
    public String toString() {
        return String.format( "Point x coordinates : { %d }" +
                              "\nPoint y coordinates : { %d } ." +
                              "\n",
                              this.getX(),
                              this.getY() );
    }
}
