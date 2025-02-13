public class MyQueue<T> {
    public T[] array;
    public int size = 0;

    public MyQueue() {
        array = (T[]) new Object[size];
    }

    public int size() {
        if (this.array == null) {
            return -1;
        }
        return this.array.length;
    }

    public void add(T value) {
        T[] newArray = (T[]) new Object[size + 1];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
        array[size] = value;
        size++;
    }

    public T peek() {
        if (0 == size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[0];
    }

    public void clear() {
        array = (T[]) new Object[size];
        size = 0;
    }
    public T poll(){
        T polledValue = array[0];
      size = size  -1;
        T[] newArray = (T[]) new Object[size];

        System.arraycopy(array, 1, newArray, 0, size);
        array = (T[]) new Object[size];
        System.arraycopy(newArray, 0, array, 0, size);
        return polledValue;
    }
}
