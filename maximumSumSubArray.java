//Given an integer array nums, find the
//subarray
// with the largest sum, and return its sum.

public class maximumSumSubArray {
    public static int Solution(int nums[]){
        int maxSubArray = Integer.MIN_VALUE;
        for (int i=0;i<nums.length-1;i++){
            int currentSum = 0;
            for (int j=i;j<nums.length-1;j++){
                currentSum+= nums[j];
                maxSubArray =Math.max(currentSum, maxSubArray);
            }
        }
        return maxSubArray;
    }
}
