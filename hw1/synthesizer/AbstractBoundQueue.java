package synthesizer;

import org.junit.Test;

public abstract class AbstractBoundQueue <T> implements BoundedQueue <T>{
    protected int fillCount;
    protected int capacity;

    @Override
    public int capacity(){
        return capacity;
    }

    @Override
    public int fillCount(){
        return fillCount;
    }

}
