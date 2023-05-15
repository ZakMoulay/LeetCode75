import java.util.Arrays;

public class MoveZeroes {
    //    Input: nums = [0,1,0,3,12] Must do in-place 66
//    Output:   [1,3,12,0,0]
//    Input: nums = [0]
//    Output: [0]

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        Arrays.stream(nums).forEach(n -> System.out.print(n + " "));
        System.out.println();
        moveZeroes(nums);
        Arrays.stream(nums).forEach(n -> System.out.print(n + " "));
    }
    public static void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if ( nums[i] != 0 ) {
                nums[k++] = nums[i];
            }
        }
        for (int i = k; i < nums.length ; i++) {
            nums[i] = 0;
        }
    }


}
