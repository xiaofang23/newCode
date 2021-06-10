package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LIS {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,8,6,4};
        System.out.println(Arrays.toString(LIS1(arr)));
    }
    /**
     * retrun the longest increasing subsequence
     * @param arr int整型一维数组 the array
     * @return int整型一维数组
     */
    public static int[] LIS1 (int[] arr) {
        // write code here
        List<Integer> res = new ArrayList<>();
        List<Integer> maxLen = new ArrayList<>();

        res.add(arr[0]);
        maxLen.add(res.size());

        for(int i=1;i<arr.length;i++) {
            if(arr[i] > res.get(res.size()-1)) {
                res.add(arr[i]);
                maxLen.add(res.size());
            }else {
                int j =0;
                while(res.get(j) <= arr[i]) {
                    j++;
                }
                res.remove(j);
                res.add(j, arr[i]);
                maxLen.add(j+1);
            }
        }
        int[] array = new int[res.size()];
        for(int i=maxLen.size()-1, j=res.size(); j>0;i--) {
            if(maxLen.get(i) == j) {
                array[--j] = arr[i];
            }
        }
        return array;
    }
}
