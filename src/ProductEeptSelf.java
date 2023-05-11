import java.util.Arrays;

public class ProductEeptSelf {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};

        int[] ans = productExpectSelf(nums);
        System.out.println(Arrays.toString(ans));

    }

        public static int[] productExpectSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int[] leftArr = new int[n];
        int[] rightArr = new int[n];
        leftArr[0] = 1;
        rightArr[n - 1] = 1;
        for (int i = 1; i < n; i++) {
            leftArr[i] = leftArr[i - 1] * nums[i - 1];
        }
        for (int i = n - 2; i >= 0; i--) {
            rightArr[i] = rightArr[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = leftArr[i] * rightArr[i];
        }

        return ans;
    }
}
