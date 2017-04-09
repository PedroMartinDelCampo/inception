/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inception.animation;

/**
 *
 * @author Pedro
 */
public class Frame extends CompoundAnimation<Timeline> {
    
    public Frame(Timeline... items) {
        super(items);
    }
    
}
