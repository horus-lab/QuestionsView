package horus.edu.br.library.components;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Map with steroids three values
 * Created by Rodrigo on 21/08/2016.
 */
@SuppressWarnings("unused")
public class ThreeMap<K, V, R> {
    List<EntrySet> values = new ArrayList<>();

    public int size() {
        return values.size();
    }

    public boolean isEmpty() {
        return values.isEmpty();
    }

    public boolean containsKey(K o) {
        for (EntrySet e : values) {
            if (e.getKey().equals(o))
                return true;
        }
        return false;
    }

    public boolean containsTitle(V o) {
        for (EntrySet e : values) {
            if (e.getTitle().equals(o))
                return true;
        }
        return false;
    }

    public boolean containsResponse(R o) {
        for (EntrySet e : values) {
            if (e.getResponse().equals(o))
                return true;
        }
        return false;
    }


    public V get(Object o) {
        return null;
    }

    public V put(K k, V v, R r) {
        EntrySet kvrEntrySet = new EntrySet(k, v, r);
        values.add(kvrEntrySet);
        return kvrEntrySet.getTitle();
    }

    public V remove(EntrySet o) {
        values.remove(o);
        return o.getTitle();
    }

    public void clear() {
        values.clear();
    }

    @Override
    public String toString() {
        String result = "{\n" +
                " \n" +
                "  \"values\": [";
        for (EntrySet e : values)
            result += e.toString() + ", ";
        result += "]\n" +
                "\n" +
                "}";
        return result;
    }

    @NonNull
    public Set<K> keySet() {
        Set<K> keys = new LinkedHashSet<>();
        for (EntrySet e : values) {
            keys.add(e.getKey());
        }
        return keys;
    }

    @NonNull
    public Collection<V> titles() {

        Set<V> keys = new LinkedHashSet<>();
        for (EntrySet e : values) {
            keys.add(e.getTitle());
        }
        return keys;
    }

    @NonNull
    public Collection<R> responses() {
        Set<R> keys = new LinkedHashSet<>();
        for (EntrySet e : values) {
            keys.add(e.getResponse());
        }
        return keys;
    }

    @NonNull
    public Set<EntrySet> entrySet() {
        Set<EntrySet> resultSet = new LinkedHashSet<>();
        for (EntrySet e : values) {
            resultSet.add(e);
        }
        return resultSet;

    }

    @Override
    public int hashCode() {
        return values.hashCode();
    }

    public int getIndex(EntrySet q) {
        return values.indexOf(q);
    }

    public class EntrySet {
        private K key;
        @NonNull
        private V title;
        private R response;

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public EntrySet(K key, @NonNull V title, R response) {
            this.key = key;
            this.title = title;
            this.response = response;
        }

        @NonNull
        public V getTitle() {
            return title;
        }

        public void setTitle(@NonNull V title) {
            this.title = title;
        }

        public R getResponse() {
            return response;
        }

        public EntrySet(K key, @NonNull V value) {
            this.key = key;
            this.title = value;
        }

        public void setResponse(R response) {
            this.response = response;
        }

        @Override
        public String toString() {
            return "{\n" +
                    "  \"title\": " + title + ",\n" +
                    "  \"key\": " + getKey() + ",\n" +
                    "  \"response\": " + getResponse() + "\n" +
                    "}";
        }
    }
}
