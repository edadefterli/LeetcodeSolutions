import java.util.Arrays;
import java.lang.Math;
public class Solution {

     public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] nums = new int[nums1.length + nums2.length];

        double mod;

        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);

        Arrays.sort(nums);

        if (nums.length % 2 == 0){
            mod = Double.valueOf(nums[(nums.length/2)-1] + nums[(nums.length/2)])/2;
        }
        else{
            mod = nums[Math.round(nums.length/2)];
        }

        return mod;
    }
}
