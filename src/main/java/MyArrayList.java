public class MyArrayList<T> {
    public T[] array;
    public int size = 0;

    public MyArrayList() {
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

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    public void clear() {
        array = (T[]) new Object[size];
        size = 0;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        int k = 0;
        T[] newArray = (T[]) new Object[size - 1];
        for (int i = 0; i < this.array.length; i++) {
            if (i != index) {
                newArray[k] = this.array[i];
                k++;
            }

        }
        size = k;
        array = (T[]) new Object[size];
        System.arraycopy(newArray, 0, array, 0, size);
    }

}
