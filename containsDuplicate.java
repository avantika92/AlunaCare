/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
 */

import java.util.HashSet;

public class containsDuplicate {
    public static Boolean containsDuplicate(int nums[]){
        HashSet<Integer> hs= new HashSet<>(nums.length);
        for (int i=0; i<nums.length;i++){
            if (hs.contains(nums[i])){
                return true;
            }
            else hs.add(nums[i]);
        }
        return false;
    }
}
