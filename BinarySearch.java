/*Given an array of integers nums which is sorted in ascending order,
and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
 */

public class BinarySearch {
    public static int binarySearch(int[] nums , int t){
        for (int i=0;i<nums.length-1; i++) {
            if (nums[i] == t) {
                System.out.print("Number found: "+ i );
                return nums[i];
            }
        }
        return -1;
        }
    public static void main(String [] args){
        int[] nums ={2,4,5,6,7};
        int t =6;
        binarySearch(nums,t);
    }

}
