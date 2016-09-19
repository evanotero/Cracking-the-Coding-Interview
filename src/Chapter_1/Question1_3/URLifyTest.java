package Chapter_1.Question1_3;

import org.junit.Test;

import static org.junit.Assert.*;

public class URLifyTest {
    @Test
    public void urlify() throws Exception {
        String input = "Mr John Smith    ";
        char[] output = {'M','r','%','2','0','J','o','h','n','%','2','0','S','m','i','t','h'};
        assertArrayEquals(output, URLify.urlify(input.toCharArray(), 13));
    }

}