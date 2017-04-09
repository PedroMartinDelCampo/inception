/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inception.timeline;

import inception.animation.Timeline;

/**
 *
 * @author Pedro
 */
public class DummyTimeline extends Timeline {

    @Override
    public void play() {
        System.out.println("Playing dummy timeline");
    }
    
}
