package LeetCodeCategories.ArrayAndHashings;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class L_380_InsertDeleteGetRandom {
    Set<Integer> store = new HashSet<>();
    public L_380_InsertDeleteGetRandom() {
    }

    public boolean insert(int val) {
        return store.add(val);
    }

    public boolean remove(int val) {
        store.remove(val);
        return true;
    }

    public int getRandom() {
        Iterator<Integer> iterator = store.iterator();
        return iterator.next();
    }
}
