
public class MyLinkedList<T> {
    public class MyNode<T> {
        public T item;
        public MyNode<T> next;
        public MyNode<T> prev;

        public MyNode(MyNode<T> prev, T element, MyNode<T> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
    public MyNode<T> head;
    public MyNode<T> tail;
    public int size = 0;

    public void add(T t){
        final MyNode<T> l = tail;
        final MyNode<T> newNode = new MyNode<>(l, t, null);
        tail = newNode;
        if (l == null)
            head = newNode;
        else
            l.next = newNode;
        size++;
    }

    public  int size(){
        return size;
    }

    public void clear(){
        head = null;
        tail = null;
        size = 0;
    }

    public T get(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        T getElemelnt;
        MyNode<T> x = head;
        for (int i = 0; i < index; i++){
            x = x.next;}
        return x.item;

        }

    public void remove(int index){
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        MyNode<T> x = head;
        for (int i = 0; i < index; i++){
            x = x.next;}

        final T element = x.item;
        final MyNode<T> next = x.next;
        final MyNode<T> prev = x.prev;

        if (prev == null) {
            head = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            tail = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;
    }


}


