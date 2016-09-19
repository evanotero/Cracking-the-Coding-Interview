package Chapter_1.Question1_1

import org.junit.Test;
import static org.junit.Assert.*;

class IsUniqueTest {

    @Test
    void testIsUnique() {
        assertTrue(IsUnique.isUnique("duck"));
    }

    @Test
    void testIsUnique_Empty() {
        assertTrue(IsUnique.isUnique(""));
    }

    @Test
    void testIsUnique_NotUnique() {
        assertFalse(IsUnique.isUnique("apple"));
    }

    @Test
    void testIsUnique_2() {
        assertTrue(IsUnique.isUnique_2("duck"));
    }

    @Test
    void testIsUnique_Empty_2() {
        assertTrue(IsUnique.isUnique_2(""));
    }

    @Test
    void testIsUnique_NotUnique_2() {
        assertFalse(IsUnique.isUnique_2("apple"));
    }
}
