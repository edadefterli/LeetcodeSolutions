// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        int k = Solution.removeDuplicates(nums);

        System.out.println("k: "+k);

        for (int i = 0; i< k ;i++) {
            System.out.print(nums[i]+" ");
        }

    }
}