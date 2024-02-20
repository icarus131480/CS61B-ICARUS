package synthesizer;

public interface BoundedQueue <T> extends Iterable <T>{
    //return buffer size
    int capacity();

    //return current number of items
    int fillCount();

    //add item x to  the end
    void enqueue(T x);

    //delete and return item from the front
    T dequeue();

    //return item from the front
    T peek();

    default  boolean isEmpty(){
        return fillCount() == 0;
    }

    default boolean isFull(){
        return capacity() == fillCount();
    }
}
