/*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

 */
import java.util.Arrays;
public class singleNumber {
    public static int singleNumber(int[] nums)
    {
        if(nums.length == 1)
            return nums[0];
        Arrays.sort(nums);

        //comparing every two elements, and incrementing to the third element (+2)
        //if they are same continue, else we found the single number
        //thus decreasing the runtime complexity
        for(int i = 0; i < nums.length; i += 2)
        {
            //not the last number in the array, and compare with next number
            if(i+1 < nums.length && nums[i] == nums[i+1])
                continue;
            else
                System.out.println(nums[i]);
                return nums[i];
            //nums[i] as the single element will always appear first in the set of two numbers
        }
        return 0;
    }
    public static void main(String[] args){
//        RemoveDuplicates rd = new RemoveDuplicates();
        int[] nums = {1,2,1,4,2,5,5};
        singleNumber(nums);
    }
}
