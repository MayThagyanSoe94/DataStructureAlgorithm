/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtgs.datastructurealgorithm.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author May Thagyan
 */
public class MyLinearSearchTest {

    @Test
    public void testSortedLinearSearch() {
        int[] items = new int[]{2, 3, 4, 5, 6, 9, 13, 15};
        Searchable arr = new MyLinearSearch(items);
        int index = arr.findItem(5);
        Assertions.assertEquals(3, index);
    }

    @Test
    public void testSortedLinearWorstCase() {
        int[] items = new int[]{2, 3, 4, 5, 6, 9, 13, 15};
        Searchable arr = new MyLinearSearch(items);
        int index = arr.findItem(-5);
        Assertions.assertEquals(-1, index);
    }

    @Test
    public void testSortedAverageCase() {
        int[] items = new int[]{2, 3, 4, 5, 6, 9, 13, 15};
        Searchable arr = new MyLinearSearch(items);
        int index = arr.findItem(6);
        Assertions.assertEquals(4, index);
    }

    @Test
    public void testUnSortedLinearSearch() {
        int[] items = new int[]{7, 2, 5, 3, 9, 1, 8, 4, 6};
        Searchable arr = new MyLinearSearch(items);
        int index = arr.findItem(5);
        Assertions.assertEquals(2, index);
    }

    @Test
    public void testUnSortedLinearWorstCase() {
        int[] items = new int[]{7, 2, 5, 3, 9, 1, 8, 4, 6};
        Searchable arr = new MyLinearSearch(items);
        int index = arr.findItem(-5);
        Assertions.assertEquals(-1, index);
    }

    @Test
    public void testUnSortedAverageCase() {
        int[] items = new int[]{7, 2, 5, 3, 9, 1, 8, 4, 6};
        Searchable arr = new MyLinearSearch(items);
        int index = arr.findItem(1);
        Assertions.assertEquals(5, index);
    }
}
