public class MyHashMap<T, X> {
    public class MyNode<T> {
        public T key;
        public T value;
        public T next;


        public MyNode(T key, T value, T next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    int size = 0;
    public MyNode<T> head;

    public void put(T key, T value) {
        boolean find = false;
        MyNode<T> x = head;

        if (size > 0) {
            for (int i = 0; i < size; i++) {
                if (x.key.equals(key)) {
                    find = true;
                    break;

                }
                x = (MyNode<T>) x.next;
            }
        }

        MyNode<T> newNode;
        if (find) {

            x.value = value;
        } else {

            newNode = new MyNode(key, value, head);
            head = newNode;
            size++;
        }
    }


    public T get(T key) {
        MyNode<T> x = head;


        for (int i = 0; i < size; i++) {
            if (key.equals(x.key)) {
                return x.value;
            }
            x = (MyNode<T>) x.next;
        }


        return null;
    }

    public void remove(T key) {
        if (head == null) {
            return;
        }

        MyNode<T> current = head;
        MyNode<T> previous = null;


        while (current != null) {
            if (key.equals(current.key)) {
                if (previous == null) {

                    head = (MyNode<T>) current.next;
                } else {

                    previous.next = current.next;
                }

                current.key = null;
                current.value = null;
                current.next = null;
                size--;
                return;
            }


            previous = current;
            current = (MyNode<T>) current.next;
        }
    }
    public  int size(){
        return size;
    }

    public void clear(){
        head = null;
        size = 0;
    }

}

