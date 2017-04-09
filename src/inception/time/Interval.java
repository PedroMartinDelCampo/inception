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
public class Interval {
    
    private Time from;
    private Time to;

    public Interval(Time from, Time to) {
        this.from = from;
        this.to = to;
    }

    public Time getFrom() {
        return from;
    }

    public void setFrom(Time from) {
        this.from = from;
    }

    public Time getTo() {
        return to;
    }

    public void setTo(Time to) {
        this.to = to;
    }
    
    
    
}
