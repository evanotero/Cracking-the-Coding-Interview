/**
 * There are three types of edits that can be preformed on strings: insert a character, remove a character,
 * or replace a character.  Given two strings, write a function to check if they are one edit (or zero edits)
 * away.
 */

package Chapter_1.Question1_5;

import static java.lang.Math.abs;

public class OneAway {
    public static boolean oneAway(String str1, String str2) {
        int str1Length = str1.length();
        int str2Length = str2.length();
        int matches;

        if (abs(str1Length - str2Length) > 1)
            return false;

        if (str1Length > str2Length)
            matches = countDifferences(str1, str2);
        else
            matches = countDifferences(str2, str1);

        return matches <= 1;
    }

    private static int countDifferences(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str2.length(); i++) {
            if (str2.charAt(i) == str1.charAt(i))
                count++;
            if (i < str1.length() - 1)
                if (str2.charAt(i) == str1.charAt(i + 1))
                    count++;
        }
        return str1.length() - count;
    }
}
