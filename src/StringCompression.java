// 443
//Input: chars = ["a","a","b","b","c","c","c"]
//        Output: Return 6, and the first 6 characters of the input
//        array should be: ["a","2","b","2","c","3"]
//        Explanation: The groups are "aa", "bb", and "ccc".
//        This compresses to "a2b2c3".
//Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
//        Output: Return 4, and the first 4 characters of the input array
//        should be: ["a","b","1","2"].
//        Explanation: The groups are "a" and "bbbbbbbbbbbb".
//        This compresses to "ab12".
//        Input: chars = ["a"]
//        Output: Return 1, and the first character of the input array should be:
//        ["a"]
//        Explanation: The only group is "a", which remains uncompressed
//        since it's a single character.



public class StringCompression {


    public static void main(String[] args) {
        char[] arr = {'a','a','b','b','c','c','c'};
        System.out.println(compress(arr));
    }
    public static int compress(char[] chars) {
        int ans = 0;
        int n = chars.length;
        for (int i = 0; i < n; ) {
            char myChar = chars[i];
            int count = 0;
            while ( i < n && chars[i] == myChar  ) {
                ++count;
                ++i;
            }
            chars[ans++] = myChar;
            if ( count > 1 ) {
                for ( char c : String.valueOf(count).toCharArray()) {
                    chars[ans++] = c;
                }
            }
        }
        return ans;
    }
}