package Chapter_1.Question1_5;

import org.junit.Test;

import static org.junit.Assert.*;

public class OneAwayTest {
    @Test
    public void oneAway() throws Exception {
        assertTrue(OneAway.oneAway("pale", "ple"));
        assertTrue(OneAway.oneAway("pales", "pale"));
        assertTrue(OneAway.oneAway("pale", "bale"));
        assertFalse(OneAway.oneAway("pale", "bake"));
    }

}