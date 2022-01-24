package pl.babiarz;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class CustomList implements OwnList {
    Integer [] customList = new Integer[] {
        @Override
        public int size() {
            return customList.length;
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
        public Iterator<int> iterator() {
            return null;
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
        public boolean add(int i) {
            return false;
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
        public boolean addAll(Collection<? extends int> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends int> c) {
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
        public int get(int index) {
            return 0;
        }

        @Override
        public int set(int index, int element) {
            return 0;
        }

        @Override
        public void add(int index, int element) {

        }

        @Override
        public int remove(int index) {
            return 0;
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
        public ListIterator<int> listIterator() {
            return null;
        }

        @Override
        public ListIterator<int> listIterator(int index) {
            return null;
        }

        @Override
        public List<int> subList(int fromIndex, int toIndex) {
            return null;
        }
    }
    @Override
    public int size() {
        return 0;
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
