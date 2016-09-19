/**
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2b1c5a3.  If the "compressed" string would not
 * become smaller than the original string, your method should return the original string.  You can
 * assume the string has only uppercase and lowercase letters (a - z).
 */

package Chapter_1.Question1_6;

public class StringCompression {
    public static String stringCompression(String str) {
        int length = str.length();

        if (length == 0) return str;

        StringBuilder sb = new StringBuilder();
        char current;
        int count = 0;
        for (int i = 0; i < length; i++) {
            count++;
            current = str.charAt(i);
            if (i + 1 >= length || current != str.charAt(i + 1)) {
                sb.append(current);
                sb.append(count);
                count = 0;
            }
        }
        return sb.toString();
    }
}
