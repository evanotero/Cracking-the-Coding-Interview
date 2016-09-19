package Chapter_1.Question1_4;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromePermutationTest {
    @Test
    public void permOfPalindrome() throws Exception {
        // True Cases
        assertTrue(PalindromePermutation.permOfPalindrome("carr eac"));
        assertTrue(PalindromePermutation.permOfPalindrome("Tact Coa"));
        assertTrue(PalindromePermutation.permOfPalindrome("aabb"));

        // False Cases
        assertFalse(PalindromePermutation.permOfPalindrome("aa ab"));
        assertFalse(PalindromePermutation.permOfPalindrome("aa  adee"));
        assertFalse(PalindromePermutation.permOfPalindrome("not a palindrome"));

        // Edge Cases
        assertTrue(PalindromePermutation.permOfPalindrome("a"));
        assertTrue(PalindromePermutation.permOfPalindrome(""));
    }

}