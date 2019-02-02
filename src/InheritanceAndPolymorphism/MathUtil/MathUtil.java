package InheritanceAndPolymorphism.MathUtil;

class MathUtil {
    
    //for integers :
    static int minAtArray( int[] ints ) {
        int min = ints[ 0 ];
        for ( int i = 0; i < ints.length - 1; i++ ) {
            if ( ints[ i ] < min ) {
                min = ints[ i ];
            }
        }
        return min;
    }
    
    //for doubles :
    static double minAtArray( double[] doubles ) {
        double min = doubles[ 0 ];
        for ( int i = 0; i < doubles.length - 1; i++ ) {
            if ( doubles[ i ] < min ) {
                min = doubles[ i ];
            }
        }
        return min;
    }
    
    //for integers :
    static int maxAtArray( int[] ints ) {
        int max = ints[ 0 ];
        for ( int i = 0; i < ints.length - 1; i++ ) {
            if ( ints[ i ] > max ) {
                max = ints[ i ];
            }
        }
        return max;
    }
    
    //for doubles :
    static double maxAtArray( double[] doubles ) {
        double max = doubles[ 0 ];
        for ( int i = 0; i < doubles.length - 1; i++ ) {
            if ( doubles[ i ] > max ) {
                max = doubles[ i ];
            }
        }
        return max;
    }
    
    //for integers :
    static int nextAfterAtArray( int[] ints, int var ) {
        int verCount = 0;
        int verNextCount = 0;
        
        for ( int i = 1; i < ints.length; i++ ) {
            int temp = ints[ i ];
            int j = i - 1;
            
            while ( ( j >= 0 ) && ints[ j ] > temp ) {
                ints[ j + 1 ] = ints[ j ];
                j--;
            }
            ints[ j + 1 ] = temp;
        }
        
        for ( int i : ints ) {
            if ( i == var ) {
                verCount++;
            }
        }
        
        for ( int i : ints ) {
            if ( i > var ) {
                verNextCount++;
                var = i;
                break;
            }
        }
        
        if ( verCount == 0 ) {
            System.out.printf( "\n" + "The integer argument %d is not found in the array."
                    + "\n", var );
            return 0;
            
        } else if ( verNextCount == 0 ) {
            System.out.printf( "\nThe next max value for %d is not found in the array." +
                    "\n%d - max value in this array.\n", var, var );
            return 0;
        }
        return var;
    }
    
    //for doubles :
    static double nextAfterAtArray( double[] doubles, double var ) {
        int verCount = 0;
        int verNextCount = 0;
        
        for ( int i = 1; i < doubles.length; i++ ) {
            double temp = doubles[ i ];
            int j = i - 1;
            
            while ( ( j >= 0 ) && doubles[ j ] > temp ) {
                doubles[ j + 1 ] = doubles[ j ];
                j--;
            }
            doubles[ j + 1 ] = temp;
        }
    
        for ( double d : doubles ) {
            if ( d == var ) {
                verCount++;
            }
        }
    
        for ( double d : doubles ) {
            if ( d > var ) {
                verNextCount++;
                var = d;
                break;
            }
        }
        
        if ( verCount == 0 ) {
            System.out.printf( "\n" + "The double argument %.2f is not found in the array."
                    + "\n", var );
            return 0;
        } else if ( verNextCount == 0 ) {
            System.out.printf( "\n" + "The next max value for %.2f is not found in the array."
                    + "\n" + "%.2f - max value in this array." + "\n", var, var );
            return 0;
        }
        return var;
    }
    
    //for integers :
    
    static int powBetween( int var, int var2 ) {
        int powerTemp = 1;
        for ( int i = 1; i <= var2; i++ ) {
            powerTemp = powerTemp * var;
        }
        return powerTemp;
    }
    
    //for doubles :
    static double powBetween( double var, double var2 ) {
        double powerTemp = 1.0;
        for ( int i = 1; i <= var2; i++ ) {
            powerTemp = powerTemp * var;
        }
        return powerTemp;
    }
}
