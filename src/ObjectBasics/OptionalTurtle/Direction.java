package ObjectBasics.OptionalTurtle;

public enum Direction {
    
    UP( "Up" ) {
        @Override
        void move( TurtleGraphics turtle, int steps ) {
            turtle.moveTurtle( this, steps );
            System.out.printf( "\nMove %d steps '%s'" +
                               "\n", steps, this.getDescription() );
        }
        
        @Override
        void clearBoard( TurtleGraphics turtle ) {
        }
    }, DOWN( "Down" ) {
        @Override
        void move( TurtleGraphics turtle, int steps ) {
            turtle.moveTurtle( this, steps );
            System.out.printf( "\nMove %d steps '%s'" +
                               "\n", steps, this.getDescription() );
        }
        
        @Override
        void clearBoard( TurtleGraphics turtle ) {
        }
    }, LEFT( "Left" ) {
        @Override
        void move( TurtleGraphics turtle, int steps ) {
            turtle.moveTurtle( this, steps );
            System.out.printf( "\nMove %d steps '%s'" +
                               "\n", steps, this.getDescription() );
        }
        
        @Override
        void clearBoard( TurtleGraphics turtle ) {
        }
    }, RIGHT( "Right" ) {
        @Override
        void move( TurtleGraphics turtle, int steps ) {
            turtle.moveTurtle( this, steps );
            System.out.printf( "\nMove %d steps '%s'" +
                               "\n", steps, this.getDescription() );
        }
        
        @Override
        void clearBoard( TurtleGraphics turtle ) {
        }
    }, CLEAR( "Clear board" ) {
        @Override
        void move( TurtleGraphics turtle, int steps ) {
        }
        
        @Override
        void clearBoard( TurtleGraphics turtle ) {
            turtle.moveTurtle( this, 0 );
            System.out.println( "\nBoard is clean. " +
                                "\nTurtle moved on start position." +
                                "\n" );
        }
    },
    ;
    
    private String description;
    
    private void setDescription( String description ) {
        this.description = description;
    }
    
    String getDescription() {
        return this.description;
    }
    
    Direction( String direction ) {
        this.description = direction;
    }
    
    abstract void move( TurtleGraphics turtle, int steps );
    
    abstract void clearBoard( TurtleGraphics turtle );
}
