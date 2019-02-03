package ObjectBasics.Clock;

import java.util.Objects;

public class Clock {
    
    private static final int DEFAULT_HOURS =    12;
    private static final int MAX_SECONDS =      60;
    private static final int MAX_MINUTES =      60;
    private static final int MAX_HOURS =        24;
    
    private int seconds;
    private int minutes;
    private int hours;
    
    private int getSeconds() {
        return this.seconds;
    }
    
    private int getMinutes() {
        return this.minutes;
    }
    
    private int getHours() {
        return this.hours;
    }
    
    private void setSeconds( int seconds ) {
        this.seconds = seconds;
    }
    
    private void setMinutes( int minutes ) {
        this.minutes = minutes;
    }
    
    private void setHours( int hours ) {
        this.hours = hours;
    }
    
    private int toSeconds( int hours, int minutes, int seconds ) {
        return seconds + ( minutes * MAX_SECONDS )
                + ( ( hours * MAX_MINUTES ) * MAX_SECONDS );
    }
    
    private int toSeconds() {
        return this.getSeconds() + ( this.getMinutes() * MAX_SECONDS )
                + ( ( this.getHours() * MAX_MINUTES ) * MAX_SECONDS );
    }
    
    private void setClock( int hours, int minutes, int seconds ) {
        setClock( toSeconds( hours, minutes, seconds ) );
    }
    
    private void setClock( int seconds ) {
        
        int tempMinutes = seconds / MAX_SECONDS;
        int tempHours = tempMinutes / MAX_MINUTES;
        
        this.setSeconds( ( seconds >= MAX_SECONDS )
                ? seconds % MAX_SECONDS
                : seconds );
        
        this.setMinutes( ( tempMinutes >= MAX_MINUTES )
                ? tempMinutes % MAX_MINUTES
                : tempMinutes );
        
        this.setHours( ( tempHours >= MAX_HOURS )
                ? tempHours % MAX_HOURS
                : tempHours );
    }
    
    void addClock( Clock clock ) {
        this.setClock( this.toSeconds() + clock.toSeconds() );
    }
    
    Clock subtractClock( Clock clock ) {
        return ( this.toSeconds() < clock.toSeconds()
                ? new Clock( clock.toSeconds() - this.toSeconds() )
                : new Clock( this.toSeconds() - clock.toSeconds() ) );
    }
    
    void tick( int bound ) {
        for ( int i = 0; i < bound; i++ ) {
            this.seconds++;
            setClock( this.toSeconds() );
            System.out.println( this );
        }
    }
    
    void tickDown( int bound ) {
        for ( int i = 0; i < bound; i++ ) {
            this.seconds--;
            setClock( this.toSeconds() );
            System.out.println( this );
        }
    }
    
    Clock( int hours, int minutes, int seconds ) {
        setClock( hours, minutes, seconds );
    }
    
    Clock( int seconds ) {
        setClock( seconds );
    }
    
    Clock() {
        this.setHours( DEFAULT_HOURS );
    }
    
    @Override
    public boolean equals( Object object ) {
        
        if ( this == object ) {
            return true;
        }
        
        if ( !( object instanceof Clock ) ) {
            return false;
        }
        
        Clock clock = ( Clock ) object;
        return this.getSeconds() == clock.getSeconds()
                && this.getMinutes() == clock.getMinutes()
                && this.getHours() == clock.getHours();
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(
                this.getSeconds(),
                this.getMinutes(),
                this.getHours() );
    }
    
    @Override
    public String toString() {
        return String.format( "%02d:%02d:%02d",
                this.getHours(),
                this.getMinutes(),
                this.getSeconds() );
    }
}



