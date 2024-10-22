/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtgs.datastructurealgorithm.array;

/**
 *
 * @author May Thagyan
 */
public class SortLinearSearch extends Array implements Searchable {

    public SortLinearSearch(int[] items) {
        super(items);
    }

    @Override
    public int findItem(int item) {
        int index = 0;
        int length = this.items.length;
        while (index < length && items[index] < item) {
            index++;
        }
        if (index < length && items[index] == item) {
            return index;
        }
        return -1;
    }
}
