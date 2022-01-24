package pl.babiarz;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomList implements OwnList {
    Integer[] customList = new Integer[]{1, 2, 3, 4};


    @Override
    public int size() {
        return customList.length;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void add(Integer element) {

    }

    @Override
    public Integer get(int i) {
        return null;
    }

    @Override
    public void add(int index, Integer element) {

    }

    @Override
    public Integer remove(int index) {
        return null;
    }
}
