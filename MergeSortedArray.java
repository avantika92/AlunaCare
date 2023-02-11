/*You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order */

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1 , j=n-1 ;
        int result[] =new int[m+n];
        while(i>=0 && j>=0 ){
            if(nums1[i]>=nums2[j]){
                nums1[i+j+1]=nums1[i] ;
                i-- ;
            }else{
                nums1[i+j+1]=nums2[j];
                j-- ;
            }
        }
        while(j>=0){
            nums1[j]=nums2[j];
            j-- ;
        }
        System.out.println(Arrays.toString(nums1));
    }
    public static void main(String [] args){
        int [] nums1 = {1,3,4,6,9};
        int [] nums2 = {0,2,5,7,9};
        int m = 5;
        int n = 5;
        merge(nums1,m,nums2,n);
    }
}