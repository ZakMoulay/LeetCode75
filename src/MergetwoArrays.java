public class MergetwoArrays {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "pqr";
        System.out.println(mergeAlternately(s1, s2));

    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        int i = 0, j = 0, k = 0;
        while (i != n && j != m) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            i++;
            j++;
        }
        while (i != n) {
            sb.append(word1.charAt(i));
            i++;
        }
        while (j != m) {
            sb.append(word2.charAt(j));
            j++;
        }
        return sb.toString();
    }

}