public class isSubsequence {

//    Input: s = "abc", t = "ahbgdc"
//    Output: true
//    Input: s = "axc", t = "ahbgdc"
//    Output: false



    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgcd"));
    }
    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j) && j < s.length()) {
                if (j == s.length() - 1) return true;
                j++;
            }
        }
        return false;
    }

}
