public class GreatestCommonDivisorString {
    //Input: str1 = "ABCABC", str2 = "ABC"
    //Output: "ABC" if not return ""
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABCABC","ABC"));
    }
    public static String gcdOfStrings(String str1, String str2) {
        if ( !(str1 + str2).equals(str2 + str1)){
            return "";
        }
        // Get the GCD of the two lengths.
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
