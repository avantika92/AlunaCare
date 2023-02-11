/*Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
 */


public class searchInsertPosition {
    public int searchPosition(int nums[], int target){
        int length = nums.length;
        //find the target
        for (int i=0; i<length-1; i++)
            if (nums[i] == target) {
                return i;
            }
            //find the position for target to be inserted
            else {
                int j = 0;
                while (j < length - 1) {
                    if (target > nums[j]) {
                        j++;
                    } else {
                        return j;
                    }
                }
            }
        return length;
    }

    public int solution(int nums[], int target){
        int left =0;
        int right = nums.length-1;
        int mid;
        while(left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (target < nums[mid]) {
                right = mid - 1;
            } else left = mid + 1;
        }
     return left;
    }
}
