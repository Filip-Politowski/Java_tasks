package org.example.insertDeleteGetRandom;

import java.util.ArrayList;
import java.util.List;

public class RandomizedSet {
    public RandomizedSet() {
    }

    private final List<Integer> elements = new ArrayList<>();


    public boolean insert(int val) {
        if (elements.contains(val)) return false;

        elements.add(val);
        return true;
    }

    public boolean remove(int val) {
        if(elements.contains(val)) {
            elements.remove((Integer) val);
            return true;
        }else {
            return false;
        }
    }

    public int getRandom() {
        return elements.get((int) (Math.random() * elements.size()));
    }


}
