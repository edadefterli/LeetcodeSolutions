import java.util.Arrays;

public class Solution {
        public static void merge(int[] nums1, int m, int[] nums2, int n) {

            int j = 0;
            for(int i = m; i<(m+n); i++){
                nums1[i] = nums2[j];
                j++;
            }

            Arrays.sort(nums1);
        }

}
