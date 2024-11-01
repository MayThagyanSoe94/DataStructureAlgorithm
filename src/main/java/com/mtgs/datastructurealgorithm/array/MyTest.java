/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtgs.datastructurealgorithm.array;

/**
 *
 * @author May Thagyan
 */
public class MyTest {
    
    public int search(int[] nums, int target) {
        boolean isSorted = isSortedArray(nums);
        for(int i = 0; i< nums.length; i++){
            if(nums[i] == target){
                return i;
            }else if(isSorted && nums[i] > target){
                return -1;
            }
        }   
        return -1;     
    }

    boolean isSortedArray(int [] nums){
        for(int i = 0; i< nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] arr1 = {4,5,6,7,0,1,2};
        int[] arr2 = {1};
        MyTest solution = new MyTest();
        int index1 = solution.search(arr1,0);
        System.out.println("Output: "+ index1);
        int index2 = solution.search(arr1,3);
        System.out.println("Output: "+ index2);
        int index3 = solution.search(arr2,0);
        System.out.println("Output: "+ index3);
    }
}