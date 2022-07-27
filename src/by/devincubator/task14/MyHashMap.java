package by.devincubator.task14;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class MyHashMap<K, V> implements Map<K, V> {
    private final int MIN_INITIAL_CAPACITY = 16;
    private Node<K, V>[] table;
    private int size;
    private int capacity;

    public MyHashMap() {
        size = MIN_INITIAL_CAPACITY;
        table = new Node[size];
    }

    static class Node<K, V> implements Map.Entry<K, V> {
        final int hash;
        final K key;
        V value;
        Node<K, V> next;

        Node(int hash, K key, V value, Node<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        @Override
        public final K getKey() {
            return key;
        }

        @Override
        public final V getValue() {
            return value;
        }

        @Override
        public V setValue(V newValue) {
            V oldValue = value;
            value = newValue;
            return oldValue;
        }
    }

    @Override
    public V get(Object key) {
        Node<K, V> node;
        return (node = getNode(hash(key), key)) == null ? null : node.value;
    }

    @Override
    public V getOrDefault(Object key, V defaultValue) {
        Node<K, V> node;
        return (node = getNode(hash(key), key)) == null ? defaultValue : node.value;
    }

    private Node<K, V> getNode(int hash, Object key) {
        for (Node<K, V> node : table) {
            Node<K, V> newNode = node;
            while (newNode != null) {
                if (checkKey(newNode, hash, key)) {
                    return newNode;
                }
                newNode = newNode.next;
            }
        }
        return null;
    }

    @Override
    public V put(K key, V value) {
        int hash = hash(key);
        int index = hash % size;
        if (table[index] == null) {
            table[index] = newNode(hash, key, value, null);
            size++;
            return null;
        }
        return putNodeNext(key, value, hash, table[index]);
    }

    private V putNodeNext(K key, V value, int hash, Node<K, V> node) {
        while (node != null) {
            if (checkKey(node, hash, key)) {
                return node.setValue(value);
            }
            node = node.next;
        }
        node = newNode(hash, key, value, null);
        size++;
        return null;
    }

    private Node<K, V> newNode(int hash, K key, V value, Node<K, V> next) {
        return new Node<>(hash, key, value, next);
    }

    @Override
    public V remove(Object key) {
        Node<K, V> node;
        return (node = removeNode(hash(key), key)) == null ? null : node.getValue();
    }

    private Node<K, V> removeNode(int hash, Object key) {
        for (Node<K, V> node : table) {
            Node<K, V> newNode = node;
            if (newNode == null) {
                continue;
            }
            if (checkKey(newNode, hash, key)) {
                node = newNode.next;
                return newNode;
            }
            while (newNode.next != null) {
                if (checkKey(newNode.next, hash, key)) {
                    newNode.next = newNode.next.next;
                    return newNode.next;
                }
                newNode = newNode.next;
            }
        }
        return null;
    }

    private boolean checkKey(Node<K, V> node, int hash, Object key) {
        return hash == node.hash && key.equals(node.key);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {
    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
