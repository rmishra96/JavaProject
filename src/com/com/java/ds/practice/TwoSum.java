package com.com.java.ds.practice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        twoSum(new int[]{1, 2, 1, 4, 5, 6, 7, 8},2);
    }

    public static int[] twoSum(int[] numbers, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i < numbers.length;i++){
            int x = numbers[i];
            if(map.containsKey(target - x)){
                return new int[] {map.get(target - x) +1 , i+1};
            }
            map.put(x,i);
        }
        throw new IllegalArgumentException("No two sum solutions");
    }
}
