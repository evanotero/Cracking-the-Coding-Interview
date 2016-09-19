package Chapter_1.Question1_6;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by evanotero
 * 9/19/16
 */
public class StringCompressionTest {
    @Test
    public void stringCompression() throws Exception {
        assertEquals("a2b1c5a3", StringCompression.stringCompression("aabcccccaaa"));
        assertEquals("a5b1", StringCompression.stringCompression("aaaaab"));
        assertEquals("b1a5", StringCompression.stringCompression("baaaaa"));
        assertEquals("a1", StringCompression.stringCompression("a"));
        assertEquals("/1", StringCompression.stringCompression("/"));
        assertEquals(" 1", StringCompression.stringCompression(" "));
        assertEquals("", StringCompression.stringCompression(""));
    }

}