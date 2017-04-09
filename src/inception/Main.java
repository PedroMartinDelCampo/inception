/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inception;

import inception.animation.Frame;
import inception.animation.Story;
import inception.animation.Timeline;
import inception.timeline.DummyTimeline;

/**
 *
 * @author Pedro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame f1 = new Frame(new DummyTimeline(), new DummyTimeline());
        Frame f2 = new Frame(new DummyTimeline(), new DummyTimeline());
        Frame f3 = new Frame(new DummyTimeline(), new DummyTimeline());
        Story story = new Story(f1, f2, f3);
        story.play();
    }
    
}
