package com;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = new int[]{0,4,3,0};
        int target = 0;
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }
    public static int[] twoSum (int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<numbers.length;i++) {
            map.put(numbers[i], i);
        }
        int[] arr = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(arr);
        int i = 0, j = numbers.length-1;
        int l = 0;
        int r = 0;
        while(i<j) {
            int sum = arr[i] + arr[j];
            if(sum == target) {
                l = arr[i];
                r = arr[j];
                break;
            } else if(sum > target) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println(l);
        System.out.println(r);
        int[] res = new int[2];
        if(l!=r) {
            res[0] = map.get(l)+1;
            res[1] = map.get(r)+1;
        }else{
            res[0] = map.get(l)+1;
            for(i=0;i<numbers.length;i++) {
                if(numbers[i] == l && i!=res[0]-1) {
                    res[1] = i+1;
                }
            } 
        }
        Arrays.sort(res);
        return res;
    }
}
