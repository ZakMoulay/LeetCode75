
// 643 LeetCode
public class FindMaxAverage {
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        System.out.println(findMaxAverage(arr,4));
    }
    public static double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double ans = sum;
        for (int i = k; i < nums.length ; i++) {
            sum += nums[i] - nums[i-k];
            ans = Math.max(ans,sum);
        }
        return ans / 4;
    }

}
