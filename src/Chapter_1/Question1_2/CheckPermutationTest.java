package Chapter_1.Question1_2;

import org.junit.Test;

import static org.junit.Assert.*;


public class CheckPermutationTest {

    @Test
    public void isPermutation() throws Exception {
        assertTrue(CheckPermutation.isPermutation("abba", "baba"));
        assertFalse(CheckPermutation.isPermutation("cat", "hat"));
        assertTrue(CheckPermutation.isPermutation("", ""));
        assertTrue(CheckPermutation.isPermutation("FoOTbaLl", "Ballfoot"));
    }

}