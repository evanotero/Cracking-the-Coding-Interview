/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 */

package Chapter_1.Question1_2;

import java.util.Arrays;

public class CheckPermutation {
    public static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] str1Chars = s1.trim().toLowerCase().toCharArray();
        char[] str2Chars = s2.trim().toLowerCase().toCharArray();
        Arrays.sort(str1Chars);
        Arrays.sort(str2Chars);
        return Arrays.equals(str1Chars, str2Chars);
    }
}
