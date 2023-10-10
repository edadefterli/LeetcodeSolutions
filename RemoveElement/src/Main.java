public class Main {
    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};

        int val = 2;

        int k = Solution.removeElement(nums,2);

        for(int i=0; i<k; i++){
            System.out.println(nums[i]);
        }

    }
}