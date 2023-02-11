import java.util.Arrays;

//Given an array of integers nums and an integer target,
// return indices of the two numbers such that they add up to target
public class TwoSum {
    public static void twoSum(int[] nums, int target){
        int[] result =new int[2];
        for (int i=0; i<nums.length-1;i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
//        for (int i = 0; i < result.length; i++) {
//
//            // Print array element present at index i
//            System.out.print(result[i] + " ");
//        }
        System.out.print(Arrays.toString(result));
    }
    public static void main(String[] args){
        int [] nums ={2,3,4,5,9};
      twoSum(nums,9);

    }
}
