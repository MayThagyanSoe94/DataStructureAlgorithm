/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtgs.datastructurealgorithm.array;

import com.mtgs.datastructurealgorithm.sorting.Util;

/**
 *
 * @author May Thagyan
 */
public class MyLinearSearch extends Array implements Searchable {

    public MyLinearSearch(int[] items) {
        super(items);
    }

    boolean isSorted = Util.isArraySorted(items);

    @Override
    public int findItem(int item) {
        Util.print("My Linear Search ", items);
        Util.printIndex("My Linear Search Item ", item);
        for (int i = 0; i < items.length; i++) {
            if (items[i] == item) {
                Util.printIndex("My Linear Search found i ", i);
                return i;
            } else if (isSorted && items[i] > item) {
                Util.printIndex("My Linear Search not found i ", i);
                return -1;
            } else {
                Util.printIndex("My Linear Search i ", i);
            }
        }
        return -1;
    }
}
