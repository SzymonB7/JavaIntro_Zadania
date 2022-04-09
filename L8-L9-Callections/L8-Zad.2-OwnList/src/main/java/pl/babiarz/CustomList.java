package pl.babiarz;

import java.util.*;

public class CustomList implements OwnList {
    Integer[] customList = new Integer[5];

    @Override
    public int size() {
        return customList.length;
    }

    @Override
    public boolean isEmpty() {
        for (Integer integer : customList) {
            if (integer == null) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void add(Integer element) {
        for (int i = 0; i < customList.length; i++) {
            if (i == customList.length - 1 && customList[i] != null) {
                customList = Arrays.copyOf(customList, customList.length + 1);
                customList[customList.length - 1] = element;
                break;
            }else if (customList[i] == null) {
                customList[i] = element;
                break;
            }
        }
    }


    @Override
    public Integer get(int i) {
        return customList[i];
    }

    @Override
    public void add(int index, Integer element) {
        if (index >= customList.length) {
            throw new IllegalArgumentException();
        }
        customList[index] = element;
    }


    @Override
    public Integer remove(int index) {
        Integer removedElement = customList[index];
        for (int i = 0; i < customList.length; i++) {
            if (index >= customList.length) {
                throw new IllegalArgumentException();
            } else if (i == index) {
                customList[i] = customList[i + 1];
            } else if (i > index && i <= customList.length - 2) {
                customList[i] = customList[i + 1];
            } else if (i == customList.length - 1){
                customList[i] = null;
            }
        } return removedElement;
    }
}

