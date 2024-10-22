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
public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int items[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        Searchable arr = new BinarySearch(items);
        int index = arr.findItem(7);
        assertEquals(6, index);
    }

    @Test
    public void testBinarySearchAverage() {
        int items[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        Searchable arr = new BinarySearch(items);
        int index = arr.findItem(4);
        assertEquals(3, index);
    }

    @Test
    public void testBinarySearchWorstCase1() {
        int items[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        Searchable arr = new BinarySearch(items);
        int index = arr.findItem(-1);
        assertEquals(-1, index);
    }
    @Test
    public void testBinarySearchWorstCase2() {
        int items[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        Searchable arr = new BinarySearch(items);
        int index = arr.findItem(8);
        assertEquals(-1, index);
    }

}
