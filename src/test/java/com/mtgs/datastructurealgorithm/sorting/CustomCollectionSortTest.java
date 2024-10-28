/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtgs.datastructurealgorithm.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

/**
 *
 * @author May Thagyan
 */
public class CustomCollectionSortTest {
    
    @Test
    public void test() {
        List<Human> list = new ArrayList<>();
        list.add(new Human("One", 10));
        list.add(new Human("Two", 3));
        list.add(new Human("Three", 25));
        list.add(new Human("Four", 11));
        list.add(new Human("Five", 9));
        
        Collections.sort(list);
        list.forEach(System.out::println);
    }
}
