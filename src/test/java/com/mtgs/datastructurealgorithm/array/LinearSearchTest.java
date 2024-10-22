/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mtgs.datastructurealgorithm.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author May Thagyan
 */
public class LinearSearchTest {

    @Test
    public void testLinearSearch() {
        int items[] = new int[]{5, 6, 1, 3, 4, 2, 7, 0};
        Searchable arr = new LinearSearch(items);
        int index = arr.findItem(1);
        assertEquals(2, index);
    }

    @Test
    public void testLinearSearchAverage() {
        int items[] = new int[]{5, 6, 1, 3, 4, 2, 7, 0};
        Searchable arr = new LinearSearch(items);
        int index = arr.findItem(4);
        assertEquals(4, index);
    }

    @Test
    public void testLinearSearchWorstCase() {
        int items[] = new int[]{5, 6, 1, 3, 4, 2, 7, 0};
        Searchable arr = new LinearSearch(items);
        int index = arr.findItem(-4);
        assertEquals(-1, index);
    }

    @Test
    public void testSortedLinearSearch() {
        int items[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        Searchable arr = new SortLinearSearch(items);
        int index = arr.findItem(1);
        assertEquals(0, index);
    }

    @Test
    public void testSortedLinearSearchAverage() {
        int items[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        Searchable arr = new SortLinearSearch(items);
        int index = arr.findItem(4);
        assertEquals(3, index);
    }

    @Test
    public void testSortedLinearSearchWorstCase() {
        int items[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        Searchable arr = new SortLinearSearch(items);
        int index = arr.findItem(-4);
        assertEquals(-1, index);
    }

    @Test
    public void test() {
        Array arr = new Array(5);
        arr.put(1, 100);
        assertEquals(100, arr.get(1));
    }

}
