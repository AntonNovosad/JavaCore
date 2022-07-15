package by.devincubator.task13;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<T> implements List<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;

    public MyLinkedList() {
        this.size = 0;
        this.first = null;
        this.last = null;
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node() {
        }

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        return getNode(index).item;
    }

    @Override
    public T set(int index, T element) {
        checkIndex(index);

        Node<T> node = getNode(index);
        T prevElement = node.item;
        node.item = element;
        return prevElement;
    }

    @Override
    public boolean add(T t) {
        addElement(t);
        size++;
        return true;
    }

    @Override
    public void add(int index, T element) {
        checkIndex(index);
        if (index == size) {
            addElement(element);
        } else {
            addElementBetween(element, getNode(index));
        }
        size++;
    }

    @Override
    public T remove(int index) {
        checkIndex(index);
        return removeElement(getNode(index));
    }

    private Node<T> getNode(int index) {
        Node<T> node;
        if (size - index > size / 2) {
            node = first;
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
        } else {
            node = last;
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
        }
        return node;
    }

    private T removeElement(Node<T> node) {
        T element = node.item;
        Node<T> nextNode = node.next;
        Node<T> prevNode = node.prev;

        if (prevNode == null) {
            first = nextNode;
        } else {
            prevNode.next = nextNode;
            node.prev = null;
        }

        if (nextNode == null) {
            last = prevNode;
        } else {
            nextNode.prev = prevNode;
            node.next = null;
        }

        node.item = null;
        size--;
        return element;
    }

    private void addElement(T t) {
        Node<T> lastNode = last;
        Node<T> newNode = new Node<>(lastNode, t, null);
        last = newNode;
        if (lastNode == null)
            first = newNode;
        else
            lastNode.next = newNode;
    }

    private void addElementBetween(T t, Node<T> node) {
        Node<T> pred = node.prev;
        Node<T> newNode = new Node<>(pred, t, node);
        node.prev = newNode;
        if (pred == null)
            first = newNode;
        else
            pred.next = newNode;
    }

    private boolean isIndex(int index) {
        return 0 <= index && index <= size;
    }

    private void checkIndex(int index) {
        if (!isIndex(index)) {
            System.out.println("Index out of array");
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
    public boolean remove(Object o) {
        return false;
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
