package by.devincubator.task14;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MyHashSet<K> implements Set<K> {
    private HashMap<K, Object> hashMap;
    private static final Object PRESENT = new Object();

    public MyHashSet() {
        hashMap = new HashMap<>();
    }

    @Override
    public int size() {
        return hashMap.size();
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return hashMap.containsKey(o);
    }

    @Override
    public Iterator<K> iterator() {
        return hashMap.keySet().iterator();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(K k) {
        return hashMap.put(k, PRESENT) == null;
    }

    @Override
    public boolean remove(Object o) {
        return hashMap.remove(0) == PRESENT;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends K> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
    }
}
