package by.devincubator.task13;

import java.util.*;

public class MyArrayList<T> implements List<T> {
    private int size;
    private Object[] elementData;

    public MyArrayList() {
    }

    public MyArrayList(int initialCapacity) {
        this.elementData = new Object[initialCapacity];
    }

    @Override
    public boolean add(T t) {
        cloneArray(size + 1);
        elementData[size++] = t;
        return true;
    }

    @Override
    public void add(int index, T element) {
        checkIndex(index);
        cloneArray(size + 1);
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        elementData[index] = element;
        size++;
    }

    @Override
    public T remove(int index) {
        checkIndex(index);
        T element = get(index);
        moveElementToLeft(index);
        size--;
        return element;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) elementData[index];
    }

    @Override
    public T set(int index, T element) {
        checkIndex(index);
        T oldValue = (T) elementData[index];
        elementData[index] = element;
        return oldValue;
    }

    private void moveElementToLeft(int index) {
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];
        }
    }

    private void cloneArray(int newCapacity) {
        elementData = Arrays.copyOf(elementData, newCapacity);
    }

    private boolean isIndex(int index) {
        return 0 <= index && index <= size;
    }

    private void checkIndex(int index) {
        if (!isIndex(index)) {
            System.out.println("Index out of Array");
        }
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }
}
