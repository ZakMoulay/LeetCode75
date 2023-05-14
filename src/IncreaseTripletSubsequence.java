public class IncreaseTripletSubsequence {
    // 334
    // Given an integer array nums, return true if there exists a triple of
    // indices (i, j, k) such that i < j < k and
    // nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
    //  Input: nums = [2,1,5,0,4,6]
    //  Output: true
    //  Explanation: The triplet (3, 4, 5) is valid because
    //  nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
    public static void main(String[] args) {
        int[] arr = {20,100,10,12,5,13};
        System.out.println(increasingTriplet(arr));
    }
    public static boolean increasingTriplet(int[] nums) {
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if ( num <= max1 ) max1 = num;
            else if ( num <= max2 ) max2 = num;
            else return true;
        }
        return false;
    }
}
