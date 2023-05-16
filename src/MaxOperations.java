import java.util.Arrays;

public class MaxOperations {
//      1697
//    Input: nums = [1,2,3,4], k = 5
//    Output: 2
//    Explanation: Starting with nums = [1,2,3,4]:
//            - Remove numbers 1 and 4, then nums = [2,3]
//            - Remove numbers 2 and 3, then nums = []
//    There are no more pairs that sum up to 5, hence a total of 2 operations.
//            Input: nums = [3,1,3,4,3], k = 6
//    Output: 1
//    Explanation: Starting with nums = [3,1,3,4,3]:
//            - Remove the first two 3's, then nums = [1,4,3]
//    There are no more pairs that sum up to 6, hence a total of 1 operation.

    public static void main(String[] args) {
        int[] arr = {4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4};
        System.out.println(maxOperations(arr, 2));
    }

    public static int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        int l = 0, r = n - 1;
        while (l < r) {
            if (nums[l] + nums[r] == k) {
                count++;
                l++;
                r--;
            } else if (nums[l] + nums[r] < k) {
                l++;
            } else {
                r--;
            }
        }
        return count;
    }
}
