/**
 * Implement an algorithm to determine if a string has all unique characters.  What if you cannot
 * use additional data structures?
 */

package Chapter_1.Question1_1;

import java.util.HashSet;
import java.util.Set;

public class IsUnique {
    public static boolean isUnique(String s) {
        Set<Character> chars = new HashSet<>();
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (chars.contains(c)) return false;
            chars.add(c);
        }
        return true;
    }

    public static boolean isUnique_2(String s) {
        for (int i = 0; i < s.length(); i++)
            if (s.indexOf(s.charAt(i), i + 1) != -1) return false;
        return true;
    }
}
