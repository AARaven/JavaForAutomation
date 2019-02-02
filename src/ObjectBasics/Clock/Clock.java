package ObjectBasics.Clock;

import java.util.Objects;

public class Clock {
    
    private static final int MAX_SECONDS = 60;
    private static final int MAX_MINUTES = 60;
    private static final int MAX_HOURS = 24;
    private static final int DEFAULT = 0;
    
    private int seconds;
    private int minutes;
    private int hours;
    
    public int getSeconds() {
        return this.seconds;
    }
    
    public int getMinutes() {
        return this.minutes;
    }
    
    public int getHours() {
        return this.hours;
    }
    
    public void setSeconds( int seconds ) {
        this.seconds = seconds;
    }
    
    public void setMinutes( int minutes ) {
        this.minutes = minutes;
    }
    
    public void setHours( int hours ) {
        this.hours = hours;
    }
    
    private int toSeconds( int hours, int minutes, int seconds ) {
        return seconds
                + ( minutes * MAX_SECONDS )
                + ( ( hours * MAX_MINUTES ) * MAX_SECONDS );
    }
    
    private int toSeconds() {
        return this.getSeconds()
                + ( this.getMinutes() * MAX_SECONDS )
                + ( ( this.getHours() * MAX_MINUTES ) * MAX_SECONDS );
    }
    
    private void setClock( int hours, int minutes, int seconds ) {
        setClock( toSeconds( hours, minutes, seconds ) );
    }
    
    public void setClock( int seconds ) {
        int tempMin = seconds / MAX_SECONDS;
        int tempHour = tempMin / MAX_MINUTES;
    
        this.seconds = ( seconds >= MAX_SECONDS )
                ? seconds % MAX_SECONDS
                : seconds;
    
        this.minutes = ( tempMin >= MAX_MINUTES )
                ? tempMin % MAX_MINUTES
                : tempMin;
    
        this.hours = ( tempHour >= MAX_HOURS )
                ? tempHour % MAX_HOURS
                : tempHour;
    }
    
    void addClock( Clock clock ) {
        this.setClock( this.toSeconds() + clock.toSeconds() );
    }
    
    Clock subtractClock( Clock clock ) {
        return ( this.toSeconds() < clock.toSeconds() ) ?
                new Clock( clock.toSeconds() - this.toSeconds() ) :
                new Clock(this.toSeconds() - clock.toSeconds());
    }
    
    void tick( int bound ) {
        for ( int i = 0; i < bound; i++ ) {
            this.seconds++;
            setClock( this.getHours(), this.getMinutes(), this.getSeconds() );
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
        this.setHours( 12 );
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
        return Objects.hash( this.seconds, this.minutes, this.hours );
    }
    
    @Override
    public String toString() {
        return String.format( "%02d:%02d:%02d",
                this.hours,
                this.minutes,
                this.seconds );
    }
}



