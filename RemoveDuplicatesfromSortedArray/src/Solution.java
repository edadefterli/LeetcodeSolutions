class Solution {
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        int duplicates = 1;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
                duplicates++;
            }
        }
        return duplicates;
    }
}