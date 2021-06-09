package com;

import java.util.*;


public class MySort {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 将给定数组排序
     * @param arr int整型一维数组 待排序的数组
     * @return int整型一维数组
     */

     public static void main(String[] args) {
         int[] arr = new int[] {5,2,3,1,4};
         arr = MySort1(arr);
         System.out.println(Arrays.toString(arr));
     }
    public static int[] MySort1 (int[] arr) {
        
        quickSort(0, arr.length-1, arr);
        return arr;
        // write code here
    }
    
    public static void quickSort(int i, int j, int[] arr) { 
        if (i >= j) {
            return ;
        } 
        int temp = arr[i];
        int left = i;
        int right = j;
        while(i<j) {
            
            while(i<j && arr[j] > temp) {
                j--;
            }
            while(i<j && arr[i] <= temp) {
                i++;
            }
            if(i<j) {
                swap(arr, i, j);
            }
        }
        arr[left] = arr[i];
        arr[i] = temp;
        quickSort(left, i-1 ,arr);
        quickSort(i+1, right ,arr);

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}