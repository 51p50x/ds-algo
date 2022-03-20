package com.p50.structures;

import java.util.HashMap;
import java.util.Map;

/*
* This class is just for study HashMaps
* HashMaps are very good for problems that needs association values
* the structure is {key: value}
* Average Scenario for Time Complexity: Access N/A Search is O(1) Insertion is O(1) Deletion is O(1)
* Worst Scenario for Time Complexity: Access N/A Search is O(n) Insertion is O(n) Deletion is O(n)
* Worst Space Complexity is O(n)
* @author 51p50x
* */
public class hashMapStudy {
    /*
    * we took as an example the problem twoSum from leetcode and implemented a hashmap
    * our
    * */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap
                = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            int diff = target  - nums[i];
            if(hashMap.containsKey(diff)){
                return new int[] {hashMap.get(diff),i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[]{};
    }

    // SINGLE NUMBER
    /*
    *  Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    *  Example: Input: nums = [2,2,1] Output: 1
    * */
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> hashmap
                = new HashMap<Integer, Integer>();
        int noAns = 0;
        int counter = 1;
        for (int num : nums) {
            if (hashmap.containsKey(num)) {
                hashmap.put(num, counter + 1);
            } else {
                hashmap.put(num, counter);
            }

        }

        for (Integer key:hashmap.keySet()){
            if(hashmap.get(key)==1)
                return (int)key;
        }
        return noAns;
    }
}
