package ObjectBasics.Clock;

public class Clock {

    private int hours;
    private int minutes;
    private int seconds;

    public Clock() {

        this.hours = 12;
        this.minutes = 0;
        this.seconds = 0;
    }

    public Clock(int Hours, int Minutes, int Seconds) {

        if (Minutes > 0) {
            for (int i = 0; i < Seconds; i++) {
                this.seconds++;
                if (this.seconds % 60 == 0) {
                    this.seconds = 0;
                    this.minutes++;
                    if (this.minutes % 60 == 0) {
                        this.minutes = 0;
                        this.hours++;
                        if (this.hours == 24) {
                            this.hours = 0;
                        }
                    }
                }
            }
        }

        if (Minutes > 0) {
            for (int i = 0; i < Minutes; i++) {
                this.minutes++;
                if (this.minutes % 60 == 0) {
                    this.minutes = 0;
                    this.hours++;
                    if (this.hours == 24) {
                        this.hours = 0;
                    }
                }
            }
        }

        if (Hours > 0) {
            for (int i = 0; i < Hours; i++) {
                hours++;
                if (hours == 24) {
                    hours = 0;
                }
            }
        }
    }

    public Clock(int someValue) {

        if (someValue >= 0) {
            for (int i = 0; i < someValue; i++) {
                this.seconds++;
                if (this.seconds % 60 == 0) {
                    this.seconds = 0;
                    this.minutes++;
                    if (this.minutes == 60) {
                        this.minutes = 0;
                        this.hours++;
                        if (this.hours == 24) {
                            this.hours = 0;
                        }
                    }
                }
            }
        }
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setClock(int Seconds) {

        this.hours = 0;
        this.minutes = 0;
        this.seconds = 0;

        if (Seconds >= 0) {
            for (int i = 0; i < Seconds; i++) {
                this.seconds++;
                if (this.seconds % 60 == 0) {
                    this.seconds = 0;
                    this.minutes++;
                    if (this.minutes == 60) {
                        this.minutes = 0;
                        this.hours++;
                        if (this.hours == 24) {
                            this.hours = 0;
                        }
                    }
                }
            }
        }
    }

    public void tick() {

        System.out.print("Timer is ticking ... ");

        this.seconds++;

        if (this.seconds % 60 == 0) {
            this.seconds = 0;
            this.minutes++;
            if (this.minutes == 60) {
                this.minutes = 0;
                this.hours++;
                if (this.hours == 24) {
                    this.hours = 0;
                }
            }
        }
    }

    public void addClock(Clock clock) {

        int tempHour = hours + clock.hours;
        int tempMinutes = minutes + clock.minutes;
        int tempSec = seconds + clock.seconds;

        if ((tempSec) > 59 ) {
            seconds = tempSec%60;
            minutes += tempSec / 60;
            if (tempMinutes > 59) {
                minutes = tempMinutes%60;
                hours += tempMinutes/60;
                if (tempHour > 23) {
                    hours = tempHour%60;
                }
            }
        }
    }
        public static String stringReturnClock (Clock clock){

            return String.format("%02d:%02d:%02d", clock.getHours(), clock.getMinutes(), clock.getSeconds());
        }

        public static void getTime (Clock clock){
            System.out.print("Time of clock : " + String.format("%02d:%02d:%02d", clock.getHours(), clock.getMinutes(), clock.getSeconds()));
        }

        public void tickDown () {
            this.seconds--;
        }

        public Clock subtractClock (Clock clock){

            int Hours = clock.hours - hours;
            int Minutes = clock.minutes - minutes;
            int Sec = clock.seconds - seconds;

            return new Clock(Hours, Minutes, Sec);
        }
    }



