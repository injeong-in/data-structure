package sec01.Linear;

import java.util.List;

public abstract class MyArrayList<E> implements List<E> {
    int size;
    private E[] array;

    public MyArrayList() {
        array = (E[]) new Object[10];
        size = 0;
    }

    public boolean add(E element) {
        if (size >= array.length) {
            //큰 배열을 만들고 요소들을 복사합니다
            E[] bigger = (E[]) new Object[array.length*2];
            System.arraycopy(array, 0, bigger, 0, array.length);
            array = bigger;
        }
        array[size] = element;
        size++;
        return true;
    }

    public E get(int index) {

        if(index<0 || index>=size) {
        throw new IndexOutOfBoundsException();
    }

        return array[index];
}

    public E set(int index, E element) {
        E old = get(index);
        array[index] = element;
        return old;
    }












}
