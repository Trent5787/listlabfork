package edu.grinnell.csc207.listlab;

import java.util.Arrays;

/**
 * An array-based implementation of the list ADT.
 */
public class ArrayList {
    
    private int[] data;
    private int size;
    private int cur;
    
    public ArrayList(){
        this.size = 10;
        this.data = new int [size];
        this.cur = 0;
    }
    
    /**
     * Adds <code>value</code> to the end of the list
     * 
     * @param value the value to add to the end of the list
     */
    public void add(int value) {
        if (cur == size){
            size *= 2;
            data = Arrays.copyOf(data, size);
            data[cur] = value;
            cur++;
        }
        else {
            data[cur] = value;
            cur++;
        }
    }

    /**
     * @return the number of elements in the list
     */
    public int size() {
        return cur;
    
    }

    /**
     * @param index the index of the element to retrieve
     * @return the value at the specified <code>index</code>
     */
    public int get(int index) {
        if (index < cur) {
            return(data[index]);
        } else {
            return(-1);
        }
        
    }

    /**
     * Removes the value at <code>index</code> from the list
     * 
     * @param index the index of the element to remove
     * @return the element at <code>index</code>
     */
    public int remove(int index) {
        int temp = get(index);
        while(index != cur) {
            data[index] = data[index+1];
            index++;
        }
        return(temp);
    }
}
