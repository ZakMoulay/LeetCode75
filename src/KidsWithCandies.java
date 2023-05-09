import java.util.*;

// 1431 LeetCode
public class KidsWithCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        System.out.println(kidsWithCandies(candies, 3));

    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    List<Boolean> myList = new ArrayList<>();
        int n = candies.length;
        int[] sortedArr = Arrays.copyOf(candies,n);
        Arrays.sort(sortedArr);
        int maxCandies = sortedArr[n-1];
        Map<Integer,Integer> hMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hMap.put(i,candies[i]);
        }
        for (int i = 0; i < n; i++) {
            if ( (hMap.get(i) + extraCandies) >= maxCandies){
                myList.add(true);
            }else {
                myList.add(false);
            }
        }
        return myList;
    }
}
