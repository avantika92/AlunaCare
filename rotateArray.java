import java.util.Arrays;

//Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
public class rotateArray {
    public static int[] rotateArray(int nums[], int k){
        int [] result = new int [nums.length];
        for (int i=0; i< nums.length ; i++){
            result[(i+k)%nums.length]= nums[i];
        }
        System.out.print(Arrays.toString(result));
        return result;
    }
    public static void main(String [] args){
        int [] nums ={1,2,3,4,5,6,7};
        int k =3;
        rotateArray(nums,k );
    }
}
