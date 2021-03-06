/**
 * Assume you have a method isSubstring which checks if one word is a substring of another.  Given two strings,
 * s1 and s2, write code to check if s2 is a rotation of s2 using only one call to isSubstring (e.g., "waterbottle"
 *  is a rotation of "erbottlewat").
 */

package Chapter_1.Question1_9;

public class StringRotation {
    public static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length())
            return false;

        String combined = s1 + s1;
        return isSubstring(combined, s2);
    }

    private static boolean isSubstring(String s1, String s2) {
        return s1.contains(s2);
    }
}
