/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtgs.datastructurealgorithm.sorting;

import static com.mtgs.datastructurealgorithm.sorting.Util.getRandomArray;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author May Thagyan
 */
public class SortingTest {

    @Test
    public void selectionSortTest() {
        //assertEquals(true, isArraySorted(new int[]{1, 2, 2, 3, 4}));
        //assertEquals(false, isArraySorted(new int[]{2, 4, 2, 3, 5}));
        //assertEquals(true, isArraySorted(new int[]{}));
        int arr[] = getRandomArray(10, 100);
        Util.print("Selection Arr >>> ", arr);
        SelectionSort algo = new SelectionSort();
        algo.sort(arr);
        Util.print("Selection Arr Sorted >>> ", arr);
        assertTrue(Util.isArraySorted(arr));
    }
    
//    @Test
//    public void bubbleSortTest() {
//        //assertEquals(true, isArraySorted(new int[]{1, 2, 2, 3, 4}));
//        //assertEquals(false, isArraySorted(new int[]{2, 4, 2, 3, 5}));
//        //assertEquals(true, isArraySorted(new int[]{}));
//        int arr[] = getRandomArray(10, 100);
//        Util.print("Bubble Arr >>> ", arr);
//        Sortable algo = new BubbleSort();
//        algo.sort(arr);
//        Util.print("Bubble Array Sorted >>> ", arr);
//        assertTrue(Util.isArraySorted(arr));
//    }
    
    @Test
    public void insertionSortTest(){
        int arr[] = new int[]{8, 3, 5, 7, 1};
        Sortable algo = new InsertionSort();
        algo.sort(arr);
        Util.print("Insertion Array Sorted >>> ", arr);
        assertTrue(Util.isArraySorted(arr));
    }
}
