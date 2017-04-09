/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inception.animation;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Pedro
 * @param <T> Type of Animatable contained
 */
public abstract class CompoundAnimation<T extends Animatable> extends AbstractAnimation {
    
    private final List<T> children;
    
    public CompoundAnimation() {
        children = new LinkedList<>();
    }
    
    public CompoundAnimation(T... items) {
        this();
        children.addAll(Arrays.asList(items));
    }
    
    public void add(T anim) {
        children.add(anim);
    }
    
    public void remove(T anim) {
        children.remove(anim);
    }
    
    public List<T> getChildren() {
        return children;
    }

    @Override
    public void play() {
        children.forEach((animatable) -> {
            animatable.play();
        });
    }
    
}
