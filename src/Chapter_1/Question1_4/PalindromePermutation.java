/**
 * Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word
 * or phrase that is the same forwards and backwards.  A permutation is a rearrangement of letters. The
 * palindrome does not need to be limited to just dictionary words.
 */

package Chapter_1.Question1_4;

import java.util.Arrays;

public class PalindromePermutation {
    public static boolean permOfPalindrome(String s) {
        s = s.replaceAll("\\s+", "");
        int length = s.length(), pairs = 0;
        char[] letters = s.toLowerCase().toCharArray();
        Arrays.sort(letters);
        for (int i = 0; i < length; i++)
            if (i + 1 < length && letters[i] == letters[i + 1]) {
                i++;
                pairs++;
            }
        return pairs == length / 2;
    }
}
