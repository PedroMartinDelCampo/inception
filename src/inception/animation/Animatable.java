/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inception.animation;

import inception.time.Interval;

/**
 *
 * @author Pedro
 */
public interface Animatable {
    void play();
    Interval getInterval();
    void setInterval(Interval interval);
}
