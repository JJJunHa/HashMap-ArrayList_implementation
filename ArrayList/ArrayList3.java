package ArrayList;

import java.util.Iterator;
public class ArrayList3<T> implements Iterable<T> {
    private T[] array;
    

    /**
     * 이 클래스는 배열을 사용하여 간단한 ArrayList를 구현합니다.
     *
     * @since 1.0
     */
    public ArrayList3() {
        array = (T[]) new Object[0];
    }

    public boolean add(T element) {
        T[] newArray = (T[]) new Object[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = element;
        array = newArray;
        return true;
    }

    public T get(int index) {
        return array[index];
    }

    public int size() {
        return array.length;
    }
    public boolean set(int index, T element) {
        if (index < 0 || index >= this.array.length) {
            return false;
        }
        this.array[index] = element;
        return true;
    }

    public T remove(int index) {
        T[] newArray = (T[]) new Object[array.length - 1];
        T removedElement = array[index];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }
        array = newArray;
        return removedElement;
    }

    @Override
    public Iterator<T> iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < array.length;
        }

        @Override
        public T next() {
            return array[currentIndex++];
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}