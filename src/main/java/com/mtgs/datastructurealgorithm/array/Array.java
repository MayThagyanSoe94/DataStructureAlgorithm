/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtgs.datastructurealgorithm.array;

/**
 *
 * @author May Thagyan
 */
public class Array {

    int size;
    protected int[] items;

    public Array() {
    }

    Array(int[] items) {
        this.items = items;
    }

    Array(int size) {
        this.size = size;
        this.items = new int[size];
    }

    void put(int index, int value) {
        this.items[index] = value;
    }

    int get(int index) {
        return this.items[index];
    }

    public static void main(String[] args) {
        Array arr = new Array(5);
        arr.items[0] = 20;
        arr.items[4] = 100;
        System.out.println("Array >>> " + arr.get(0));
        System.out.println("Array >>> " + arr.get(1));
        System.out.println("Array >>> " + arr.get(2));
        System.out.println("Array >>> " + arr.get(3));
        System.out.println("Array >>> " + arr.get(4));
    }
}
