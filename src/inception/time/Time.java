/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inception.time;

/**
 *
 * @author Pedro
 */
public class Time {
    
    private int seconds;
    private int minutes;
    private int hours;
    
    public Time() {
        this(0);
    }
    
    public Time(int seconds) {
        this(seconds, 0);
    }
    
    public Time(int seconds, int minutes) {
        this(seconds, minutes, 0);
    }
    
    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    
    
    
}
