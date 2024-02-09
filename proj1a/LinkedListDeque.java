public class LinkedListDeque <T>{
    public class NodeT <T>{
        T item;
        NodeT<T> prev,next;
        public NodeT (){
            prev = next = this;
        }
        public NodeT (T _item, NodeT<T> _prev, NodeT<T> _next){
            this.item = _item;
            this.prev =  _prev;
            this.next = _next;
        }
    }
    private NodeT <T> sentinel,last;
    private int size;
    public LinkedListDeque(){
        size = 0;
        last = sentinel = new NodeT <T>();
    }
    public void addFirst(T item){
        size += 1;
        NodeT<T> tempNode = new NodeT<T>(item,sentinel,sentinel.next);
        sentinel.next.prev = tempNode;
        sentinel.next = tempNode;
        if (size == 1){last = tempNode;}
    }
    public void addLast(T item){
        size += 1;
        NodeT<T> tempNode = new NodeT<T>(item,last,sentinel);
        sentinel.prev = tempNode;
        last.next = tempNode;
        last = tempNode;
    }
    public boolean isEmpty(){
        return (sentinel.next==sentinel);
    }
    public int size(){
        return size;
    }
    public void printDeque(){
        int cmp = 0;
        NodeT<T> currentNode = sentinel.next;
        if (currentNode == null){return;}
        while (cmp<size){
            cmp++;
            System.out.print(currentNode.item.toString()+' ');
            currentNode = currentNode.next;
        }
    }
    public T removeFirst(){
        if (sentinel == last){return null;}
        NodeT<T> tempNode = sentinel.next;
        sentinel.next = tempNode.next;
        tempNode.next.prev = sentinel;
        return tempNode.item;
    }
    public T removeLast(){
        if (sentinel == last){return null;}
        T tempItem = last.item;
        last = last.prev;
        last.next = sentinel;
        sentinel.prev = last;
        return tempItem;
    }
    public T get(int index){
        if (sentinel==last || index+1>size){return null;}
        int cmp = 0;
        NodeT<T> currentNode = sentinel.next;
        while (cmp<index){
            currentNode = currentNode.next;
            cmp++;
        }
        return currentNode.item;
    }
}
