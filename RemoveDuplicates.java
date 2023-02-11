import java.util.Arrays;

/*Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such
that each unique element appears only once. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages,
you must instead have the result be placed in the first part of the array nums.
More formally, if there are k elements after removing the duplicates,
then the first k elements of nums should hold the final result.
It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.
*/
public class RemoveDuplicates {
    public static void noDuplicates(int[] nums){
        if (nums.length == 0 ){
            System.out.println("Empty String set");
        }
        int i = 0, j = 1;
        while(j < nums.length) {
            if(nums[j] != nums[i])
                nums[(i++)+1] = nums[j];
            j++;
        }
        System.out.println(i+1);
    }
    public static void main(String[] args){
//        RemoveDuplicates rd = new RemoveDuplicates();
        int[] nums = {1,2,3,4,4,5,5};
        noDuplicates(nums);
    }
}
