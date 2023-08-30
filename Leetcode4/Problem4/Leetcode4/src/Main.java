import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double median;

        int[] nums1 = {1,2};

        int[] nums2 = {4,3};

        Solution sol = new Solution();

        median = sol.findMedianSortedArrays(nums1,nums2);

        System.out.println("Median: "+ median);

    }
}