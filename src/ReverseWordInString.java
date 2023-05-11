public class ReverseWordInString {
    public static void main(String[] args) {
        String st = "the sky is blue";
        System.out.println(st);
        System.out.println(reverseWordInString(st));
    }




    public static String reverseWordInString(String s) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != ' ')
                sb1.append(c);
            if ((c == ' ' || i == 0) && sb1.length() > 0) {
                if (sb2.length() > 0) {
                    sb2.append(" ");
                }
                sb2.append(sb1.reverse());
                sb1.setLength(0);
            }
        }
        return sb2.toString();
    }
}
