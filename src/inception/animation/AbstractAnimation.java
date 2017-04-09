/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inception.animation;

import inception.time.Interval;
import inception.time.Time;

/**
 *
 * @author Pedro
 */
public abstract class AbstractAnimation implements Animatable {
    
    private Interval interval;
    private final int DEFAULT_INTERVAL = 30;

    public AbstractAnimation() {
        this.interval = new Interval(new Time(), new Time(DEFAULT_INTERVAL));
    }

    @Override
    public Interval getInterval() {
        return interval;
    }

    @Override
    public void setInterval(Interval interval) {
        this.interval = interval;
    }
    
}
